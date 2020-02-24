package correctPersons;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        checkPreconditions(firstName, lastName, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }
    private void checkPreconditions(String firstName, String lastName, int age) throws NameUndefinedException, IncorrectAgeException {
        if(firstName.equals(null) || firstName.length() <= 2){
            throw new NameUndefinedException("Podano niewłasciwe imie, badz null");
        }
        if(lastName.equals(null) || lastName.length() <= 2){
            throw new NameUndefinedException("Podano niewłasciwe nazwisko, badz null");
        }
        if(age < 0){
            throw new IncorrectAgeException("Podano ujemny wiek");
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
