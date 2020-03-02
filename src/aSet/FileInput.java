package aSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileInput {
    public static ArrayList readsValuesFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = countLines(fileName);
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < lines; i++) {
            int inputValue = scanner.nextInt();
            String line = scanner.nextLine();
            arrayList.add(inputValue);

        }
        System.out.println(arrayList);
        return  arrayList;
    }
    private static int countLines(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = 0;
        while (scanner.hasNextLine()) {
            lines++;
            scanner.nextLine();
        }
        return lines;
    }
}
