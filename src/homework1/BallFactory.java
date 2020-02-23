package homework1;

import java.util.Scanner;

public class BallFactory {


    public static Ball[] generateBall(){
        Ball[] balls = new Ball[3];
        boolean isDuplicate = false;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < balls.length;i++) {
            String color = "";
            int size = 0;
            Ball ball = new Ball(color, size);

           do {
               System.out.println("Wprowadz kolor kulki " + i);
               color = scan.nextLine();
               System.out.println("Wprowadz rozmiar kulki: " + i);
               size = scan.nextInt();

               ball = new Ball(color, size);

               for (int j = 0; j <= i;) {

                   if (ball.equals(balls[j]) && i != j) {
                       System.out.println("Taka kulka już istnieje. Podaj inne wartości");
                       isDuplicate = true;
                        break;
                   } else {
                       isDuplicate = false;
                       j++;
                   }
               }
               scan.nextLine();
           }
                while (isDuplicate );
                balls[i] = ball;
                isDuplicate = false;

        }
            scan.close();

        return balls;
    }

}
