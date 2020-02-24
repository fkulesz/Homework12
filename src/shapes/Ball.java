package shapes;

public class Ball extends Shape3D {
    private static final double PI = 3.14;
    private int r;

    public Ball(int r) {
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
