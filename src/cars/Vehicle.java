package cars;

public class Vehicle {
    private String name;
    private double tankCapacity;
    private double averageFuelConsumption;

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }


    public Vehicle(String name, double tankCapacity, double averageFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public double countAverageFuelConsumption(){
        return this.averageFuelConsumption;
    }

    public void countDistance(){
        System.out.println(" pojazd przejedzie " +  tankCapacity * 100 / averageFuelConsumption + " kilometrów");
    }


    public String showInfo(){

        return "Vehicle{" +
                "name='" + name + '\'' +
                ", tankCapacity=" + tankCapacity +
                ", averageFuelConsumption=" + averageFuelConsumption +
                '}';
        }




}
