package countNumbers;

import aSet.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
      ArrayList arrayList = FileInput.readsValuesFromFile("plik2.txt");
      ArrayHelper.countNumbersInArray(arrayList);
    }
}
