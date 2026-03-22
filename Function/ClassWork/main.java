
abstract class Device {
    String brand;

    Device(String brand) {
        this.brand = brand;
    }

    abstract void turnOn();
}

interface RemoteControllable {
    void connectToWiFi();
}
interface PowerSaving {
    int getEnergyRating();
}

class SmartTV extends Device implements RemoteControllable, PowerSaving {

    SmartTV(String brand) {
        super(brand);
    }
    @Override
    void turnOn() {
        System.out.println(brand + " TV is booting up...");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Connecting to Home_5G...");
    }

    @Override
    public int getEnergyRating() {
        return 5;
    }
}

class ElectricKettle extends Device {

    ElectricKettle(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " Kettle is heating water...");
    }
}
public class main {
    public static void main(String arags[]) {

        
        Device d = new SmartTV("Sony");
        d.turnOn();
        Device kettle = new ElectricKettle("Philips");
        kettle.turnOn();

        RemoteControllable r = new SmartTV("LG");
        r.connectToWiFi();

        
    }
}
