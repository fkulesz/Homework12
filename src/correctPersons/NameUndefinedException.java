package correctPersons;

public class NameUndefinedException extends Exception {
    public NameUndefinedException(String s) {
        System.out.println("Podano niewłasciwe imie, badz null");
    }
}
