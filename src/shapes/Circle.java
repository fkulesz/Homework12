package shapes;

public class Circle extends GeometricShape {
    private static final double PI = 3.14;
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public static double getPI() {
        return PI;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

}
