package cars;

public class Truck extends Car {
    private double loadWeight;

    public Truck(String name, double tankCapacity, double averageFuelConsumption, boolean isAirConditionOn, double loadWeight) {
        super(name, tankCapacity, averageFuelConsumption, isAirConditionOn);
        this.loadWeight = loadWeight;
    }

    @Override
    public double countAverageFuelConsumption(){
        double averageFuelConsumption = super.countAverageFuelConsumption();
        double loadWeightCheck  = this.loadWeight;
        while (loadWeightCheck > 100){
            averageFuelConsumption += 0.5;
            loadWeightCheck -= 100;
        }
        return averageFuelConsumption;
    }

    @Override
    public String showInfo(){
        String carInfo = super.showInfo();
        return carInfo + " zaladunek " + loadWeight;

    }

}
