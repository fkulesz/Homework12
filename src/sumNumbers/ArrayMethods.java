package sumNumbers;

import java.util.ArrayList;

public class ArrayMethods {
    public static void dispalyReverseArray(ArrayList arrayList){
      ArrayList arrayListReverse = new ArrayList();

        int iterator = arrayList.size()-1;
        while(iterator >= 0){
            arrayListReverse.add(arrayList.get(iterator));
            iterator --;
        }
        System.out.println("Odwrócona arrayjka : " + arrayListReverse);
    }

    public static void sumArrayElements(ArrayList arrayList){
        float sum = (float) arrayList.get(0);
        String resultString1 = String.valueOf(arrayList.get(0)) + " + ";
        String resultString2;
        for (int i = 1; i <arrayList.size() ; i++) {
            sum += Float.parseFloat(String.valueOf(arrayList.get(i)));
            resultString1 += String.valueOf(arrayList.get(i)) + " + ";
        }
        resultString2 = resultString1 + " = " + sum;
        System.out.println(resultString2);
    }
    public static float findMinValue(ArrayList arrayList){
        float minValue = (float) arrayList.get(0);

        for (int i = 0; i < arrayList.size() ; i++) {
            minValue = Math.min(minValue, (float) arrayList.get(i));
        }

        System.out.println("minimalna wartosc : " + minValue);

        return minValue;
    }

    public static float findMaxValue(ArrayList arrayList){
        float maxValue = (float) arrayList.get(0);

        for (int i = 0; i < arrayList.size() ; i++) {
            maxValue = Math.max(maxValue, (float) arrayList.get(i));
        }

        System.out.println("maksymalna wartosc : " + maxValue);

        return maxValue;
    }

}
