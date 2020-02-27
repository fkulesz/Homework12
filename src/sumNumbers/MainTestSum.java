package sumNumbers;

import java.util.ArrayList;

public class MainTestSum {
    public static void main(String[] args) {
        ArrayList arrayList = NumberGenerator.generateNumbers();
       ArrayMethods.dispalyReverseArray(arrayList);
       ArrayMethods.sumArrayElements(arrayList);
       ArrayMethods.findMinValue(arrayList);
       ArrayMethods.findMaxValue(arrayList);
    }
}
