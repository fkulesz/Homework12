package task1listy;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGenerator {
    public ArrayList<Double> generateArray(){
        ArrayList<Double> newArrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Wprowadz liczbe " + i);
            newArrayList.add(scan.nextDouble());

        }
        return newArrayList;
    }

    public void displayArray(ArrayList arrayList){
        System.out.println(arrayList.toString());

    }


}
