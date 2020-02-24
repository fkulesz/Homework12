package movetable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inputTable = {1, 2, 3, 4, 5};
        System.out.println("stara tablica : " + Arrays.toString(inputTable));
        try{
            int[] newTable =  NTable.moveTable(null, 12);
            System.out.println("nowa tablica : " + Arrays.toString(newTable));

        } catch (NullPointerException e){
            System.out.println("Tablica wejściowa jest pusta");
        }

        try{
            int[] newTable =  NTable.moveTable(inputTable, -3);
            System.out.println("nowa tablica : " + Arrays.toString(newTable));

        } catch (NullPointerException e){
            System.out.println("Tablica wejściowa jest pusta");
        }

        try{
            int[] newTable =  NTable.moveTable(inputTable, 4);
            System.out.println("nowa tablica : " + Arrays.toString(newTable));

        } catch (NullPointerException e){
            System.out.println("Tablica wejściowa jest pusta");
        }

    }
}
