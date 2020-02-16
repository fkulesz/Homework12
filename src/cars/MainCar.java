package cars;

public class MainCar {
    public static void main(String[] args) {
        Truck truck1 = new Truck("renault", 5, 10, false, 201);
        Truck truck2 = new Truck("volvo", 20, 8, false, 401);
        Car car1 = new Car("fiat", 20, 8, false);

        Car[] cars =  new Car[3];
        cars[0] = truck1;
        cars[1] = truck2;
        cars[2] = car1;

        for (int i = 0; i < cars.length ; i++) {
            cars[i].setAirConditionOn(true);
            cars[i].setAverageFuelConsumption(cars[i].countAverageFuelConsumption());
            System.out.println(cars[i].showInfo());
            cars[i].countDistance();
        }

        for (int i = 0; i < cars.length ; i++) {
            cars[i].setAirConditionOn(false);
            cars[i].setAverageFuelConsumption(cars[i].countAverageFuelConsumption());
            System.out.println(cars[i].showInfo());
            cars[i].countDistance();
        }



    }
}
