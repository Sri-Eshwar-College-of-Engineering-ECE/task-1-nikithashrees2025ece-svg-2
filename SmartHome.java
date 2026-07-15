abstract class Appliance {
    String applianceName;
    int hoursUsed;

    Appliance(String applianceName, int hoursUsed) {
        this.applianceName = applianceName;
        this.hoursUsed = hoursUsed;
    }

    abstract double calculatePowerConsumption();
}

class Fan extends Appliance {

    Fan(String applianceName, int hoursUsed) {
        super(applianceName, hoursUsed);
    }

    double calculatePowerConsumption() {
        return 75 * hoursUsed;
    }
}

class AirConditioner extends Appliance {

    AirConditioner(String applianceName, int hoursUsed) {
        super(applianceName, hoursUsed);
    }

    double calculatePowerConsumption() {
        return 1500 * hoursUsed;
    }
}

class WashingMachine extends Appliance {

    WashingMachine(String applianceName, int hoursUsed) {
        super(applianceName, hoursUsed);
    }

    double calculatePowerConsumption() {
        return 500 * hoursUsed;
    }
}

public class SmartHome {
    public static void main(String[] args) {

        Appliance[] appliances = new Appliance[3];

        appliances[0] = new Fan("Ceiling Fan", 8);
        appliances[1] = new AirConditioner("LG AC", 5);
        appliances[2] = new WashingMachine("Samsung Washing Machine", 2);

        System.out.println("Smart Home Appliances");
        System.out.println("----------------------------");

        for (Appliance appliance : appliances) {
            System.out.println("Appliance : " + appliance.applianceName);
            System.out.println("Power Consumed : " +
                    appliance.calculatePowerConsumption() + " Watts");
            System.out.println();
        }
    }
}