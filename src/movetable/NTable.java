package movetable;

import java.util.Arrays;

public class NTable {
    public static int[] moveTable(int[] inputTable, int N) {

        int[] tempTable = inputTable;
        int timesMoved = 0;
        if(N <= 0 || N >= inputTable.length ){
            System.out.println("N poza przedziałem");
            return inputTable;
        }
        while (timesMoved < N) {
            int temp = tempTable[0];
            for (int i = 0; i < tempTable.length - 1; i++) {
                tempTable[i] = tempTable[i + 1];
               }
            tempTable[tempTable.length - 1] = temp;
            timesMoved++;
        }
        System.out.println("Przesunięta tablica: ");
        return tempTable;
    }
}
