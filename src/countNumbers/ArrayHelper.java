package countNumbers;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayHelper {
    public static void countNumbersInArray(ArrayList arrayList){
        int minValue = findMinInArray(arrayList);
        int maxValue = findMaxInArray(arrayList);
        for (int j = minValue; j <= maxValue ; j++) {
            int iterator = 0;
            for (int i = 0; i < arrayList.size(); i++){
                if(arrayList.get(i).equals(j)){
                    iterator++;
                }
            }
            if(iterator > 0){
                System.out.println(j + " - liczba wystapień  to :  " + iterator);
            }
        }
    }
    private static int findMaxInArray(ArrayList arrayList){
       int maxValue = (int) Collections.max(arrayList);
        System.out.println("maxValue in Array: " + maxValue);
       return maxValue;
    }
    private static int findMinInArray(ArrayList arrayList){
        int minValue = (int) Collections.min(arrayList);
        System.out.println("minValue in Array: " + minValue);
        return minValue;
    }
}
