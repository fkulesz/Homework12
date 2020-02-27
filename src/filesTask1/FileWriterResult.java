package filesTask1;

import java.io.BufferedWriter;
import java.io.*;
public class FileWriterResult {
    static void saveResultToFile(String medium, String min, String max, String[] numbersInDepartment, String fileName) throws IOException {
        BufferedWriter writer  = new BufferedWriter(new FileWriter(fileName));
        writer.write(medium);
        writer.newLine();
        writer.write(min);
        writer.newLine();
        writer.write(max);
        writer.newLine();
        for (int i = 0; i < numbersInDepartment.length ; i++) {
            writer.write(numbersInDepartment[i]);
            writer.newLine();
        }
        writer.close();
        System.out.println("Zapis zakonczony");

    }
}
