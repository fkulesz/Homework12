package shapes;

public abstract class Shape2D  extends  Shape implements Calc2D{
    @Override
    public float circleArea(Circle circle) {
        float area = (float) (Math.pow(circle.getR(),2)*Circle.getPI());
        return area;
    }

    @Override
    public float rectangleArea(Rectangle rectangle) {
        float area = rectangle.getA()*rectangle.getB();
        return area;
    }

    @Override
    public float getLineLenght(){
        return 0;
    }

}
