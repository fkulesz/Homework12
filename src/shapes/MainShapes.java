package shapes;

public class MainShapes {
    public static void main(String[] args) {
        Ball ball = new Ball(5);
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4, 5);
        Cube cube = new Cube(6);
        Line2D line2D =  new Line2D(5, 5,0,5);

        Shape[] shapes = new Shape[5];
        shapes[0] = ball;
        shapes[1] = circle;
        shapes[2] = rectangle;
        shapes[3] = cube;
        shapes[4] = line2D;


        System.out.println("Pojemnosc kuli: " + shapes[0].ballVolume(ball));
        System.out.println("powierzchnia  koła: " + shapes[1].circleArea(circle));
        System.out.println("powierzchnia prostokąta : " + shapes[2].rectangleArea(rectangle));
        System.out.println("Pojemnosc szczescianu " + shapes[3].cubeVolume(cube));
        System.out.println("Dlugosc odcinka " + shapes[4].getLineLenght());

    }
}
