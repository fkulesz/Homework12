package zajecia9.pojazdy;

public abstract class Vehicle implements Moveable{
    private static final String FORWARD = "Przód";
    private static final String BACKWARD = "Tył";
    private static final String LEFT = "Lewo";
    private static final String RIGHT = "Prawo";

    private String name;
    private int year;
    private String direction;


}
