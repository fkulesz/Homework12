package zajecia9.persons;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String pesel;
    private int age;
    private Address address;

    public Person(String firstName, String lastName, String pesel, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                pesel.equals(person.pesel) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel, age, address);
    }
}
