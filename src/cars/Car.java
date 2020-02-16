package cars;

public class Car extends Vehicle {
    private boolean isAirConditionOn;

    public boolean isAirConditionOn() {
        return isAirConditionOn;
    }

    public void setAirConditionOn(boolean airConditionOn) {
        isAirConditionOn = airConditionOn;
    }

    public Car(String name, double tankCapacity, double averageFuelConsumption, boolean isAirConditionOn) {
        super(name, tankCapacity, averageFuelConsumption);
        this.isAirConditionOn = isAirConditionOn;

    }

    @Override
    public double countAverageFuelConsumption(){
        double averageFuelConsumption = super.getAverageFuelConsumption();
        if(isAirConditionOn) {
            averageFuelConsumption += 0.8;
        }
        return averageFuelConsumption;
    }
    @Override
    public String showInfo(){
        String infoVehicle = super.showInfo();
        return infoVehicle+ " Klima: " + isAirConditionOn;
    }
}
