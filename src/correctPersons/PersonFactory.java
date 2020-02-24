package correctPersons;

import java.util.Scanner;

public class PersonFactory {
    public static Person createPerson() throws NameUndefinedException, IncorrectAgeException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wprowadz imie: ");
        String name = scan.nextLine();

        System.out.println("Wprowadz nazwisko: ");
        String forname = scan.nextLine();

        System.out.println("Wprowadz wiek: ");
        int age = scan.nextInt();

        System.out.println("Wprowadz pesel: ");
        String pesel = scan.nextLine();

        Person person = new Person(name, forname, age, pesel);

        System.out.println("utworzono osobę  : " + person.toString());

        scan.close();
        return person;
    }
}
