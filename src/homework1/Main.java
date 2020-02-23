package homework1;

public class Main {
    public static void main(String[] args) {
        Ball[] balls = BallFactory.generateBall();
        System.out.println("Twoje kulki maja kolor: " + balls[0].getColor() + ' ' +  balls[1].getColor() + ' ' + balls[2].getColor()  );
        System.out.println("Twoje kulki maja rozmiar: " + balls[0].getSize() + ' ' +  balls[1].getSize() + ' ' + balls[2].getSize()  );
    }
}
