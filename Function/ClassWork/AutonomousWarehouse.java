abstract class Robot{
    private String batteryId;
    private double chargeLevel;
    public Robot(String batteryId,double chargelavel){
        this.batteryId=batteryId;
        this.chargeLevel=chargeLevel;

    }
    public String getBatteryId() {
        return batteryId;
    }
    public void reportStatus(){
        System.out.println("Robot ID: " + batteryId + " | Charge: " + chargeLevel + "%");
    }
    protected boolean hasEnoughCharge(double required) {
        if (chargeLevel < required) {
            System.out.println("Low battery!");
            return false;
        }
        return true;
    }
}

class DroneRobot extends Robot {

    public DroneRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    @Override
    public void performTask() {
        double consumption = 15.0;

        if (hasEnoughCharge(consumption)) {
            chargeLevel -= consumption;
            System.out.println("Drone completed task at 2x speed.");
        }
    }
}
class GroundRobot extends Robot {

    public GroundRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    @Override
    public void performTask() {
        double consumption = 5.0;

        if (hasEnoughCharge(consumption)) {
            System.out.println("Performing surface check...");
            chargeLevel -= consumption;
            System.out.println("Ground robot completed task.");
        }
    }
}
public class
