package sumNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberGenerator {
    public static ArrayList<Number> generateNumbers(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Number> resultArray = new ArrayList<>();
        float inputNumber = 0;
        while(inputNumber >= 0) {
            System.out.println("Podaj kolejną liczbę: ");
            inputNumber = scanner.nextFloat();
            if(inputNumber >= 0) {
                resultArray.add(inputNumber);
            }
            scanner.nextLine();
        }
        System.out.println("moja arrayka: " + resultArray);
        return resultArray;
    }
}
