package shapes;

import task1.Main;

public class Line2D extends Shape2D {

    private int x1;
    private int x2;
    private  int y1;
    private int y2;

    public Line2D(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public float getLineLenght() {
        float lineLenght = (float) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        return  lineLenght;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return 0;
    }

    @Override
    public double ballVolume(Ball ball) {
        return 0;
    }
}
