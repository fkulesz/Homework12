package filesTask1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    static Employee[] readsEmployeeDetailsFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = countLines(fileName);
        Employee[] employees = new Employee[lines];
        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            int employeeSallary = Integer.parseInt(split[4]);
            employees[i] = new Employee(split[0], split[1], split[2], split[3], employeeSallary);
            System.out.println(employees[i].toString());
        }
        return  employees;
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
