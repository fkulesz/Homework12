package zajecia9.pojazdy;

public class RentableCar extends Car implements Rentable {

    private Person person;

    public RentableCar(String firstName, String lastName) {
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        Person person = new Person();

    }

    @Override
    public void handOver() {

    }

    @Override
    public boolean isRent() {
        return false;
    }
}
