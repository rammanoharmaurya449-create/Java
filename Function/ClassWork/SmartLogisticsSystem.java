abstract class Robot {
    private String batteryId;       
    protected double chargeLevel;

    public Robot(String batteryId, double chargeLevel) {
        this.batteryId = batteryId;
        this.chargeLevel = chargeLevel;
    }

    public String getBatteryId() {
        return batteryId;
    }


    public void reportStatus() {
        System.out.println("Battery ID: " + batteryId + ", Charge: " + chargeLevel + "%");
    }


    public abstract void performTask();
}


class DroneRobot extends Robot {

    public DroneRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    @Override
    public void performTask() {
        if (chargeLevel < 15) {
            System.out.println("Drone " + getBatteryId() + ": Low battery!");
            return;
        }

        chargeLevel -= 15;
        System.out.println("Drone " + getBatteryId() + " completed task at 2x speed.");
    }
}


class GroundRobot extends Robot {

    public GroundRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    @Override
    public void performTask() {
        if (chargeLevel < 5) {
            System.out.println("GroundRobot " + getBatteryId() + ": Low battery!");
            return;
        }

        System.out.println("GroundRobot " + getBatteryId() + ": Surface check done.");
        chargeLevel -= 5;
        System.out.println("GroundRobot " + getBatteryId() + " completed task.");
    }
}
public class SmartLogisticsSystem {
    public static void main(String[] args) {

        Robot[] fleet = {
            new DroneRobot("D-1", 20.0),
            new GroundRobot("G-5", 10.0),
            new DroneRobot("D-2", 10.0)
        };

        for (Robot r : fleet) {
            r.performTask();   
            r.reportStatus();
            System.out.println();
        }
    }
}