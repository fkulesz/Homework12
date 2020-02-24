package correctPersons;

public class IncorrectAgeException extends Exception {
    public IncorrectAgeException(String e) {
        System.out.println("Podano ujemny wiek");
    }
}
