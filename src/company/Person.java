package company;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void showInfo(){
        System.out.println("Imie " + firstName + " Nazwisko " +  lastName );
    }
}
