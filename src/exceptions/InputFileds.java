package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputFileds {
    public String[] generateString(){
        String inputField = "";
        int index = 0;
        String[] newArray = new String[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < newArray.length+1; i++) {
            try {
                System.out.println("Podaj stringa: " + i);
                newArray[i]  = scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Podana zła wartość ");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" poza tablicą ");
            }
        }

        return newArray;
    }
}
