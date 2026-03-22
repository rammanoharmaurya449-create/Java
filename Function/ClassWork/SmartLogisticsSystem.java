abstract class Transport {
    String id;

    Transport(String id) {
        this.id = id;
    }

    abstract void dispatch();
}

interface GPS {
    void getCoordinates();

    default void pingServer() {
        System.out.println("Status: Online...");
    }
}

interface Autonomous {
    void selfNavigate();
}


class Truck extends Transport {

    Truck(String id) {
        super(id);
    }

    void dispatch() {
        System.out.println("Truck " + id + " leaving warehouse by road...");
    }
}

class DeliveryDrone extends Transport implements GPS, Autonomous {

    DeliveryDrone(String id) {
        super(id);
    }

    @Override
    void dispatch() {
        System.out.println("Drone " + id + " taking off...");
    }

    @Override
    public void getCoordinates() {
        System.out.println("Drone " + id + " coordinates: [12.9716, 77.5946]");
    }

    @Override
    public void selfNavigate() {
        System.out.println("Drone " + id + " navigating autonomously...");
    }
}
public class SmartLogisticsSystem {
    public static void main(String[] args) {

        Transport t = new DeliveryDrone("D101");
        t.dispatch();

        GPS g = new DeliveryDrone("D1U1");
        g.pingServer();

        Transport truck = new Truck("T202");

        if (truck instanceof GPS) {
            GPS gpsTruck = (GPS) truck;
            gpsTruck.getCoordinates();
        } else {
            System.out.println("Truck is not GPS enabled (No action)");
        }
    }
}
