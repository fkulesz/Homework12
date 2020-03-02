package aSet;

import filesTask1.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {
   public static  Map<Integer, Customer> readsValuesFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = countLines(fileName);
       Map<Integer, Customer> customerMap = new HashMap<>();


       for (int i = 0; i < lines; i++) {
           String line = scanner.nextLine();
           String[] split = line.split(";");
           int customerId = Integer.parseInt(split[0]);
           customerMap.put(customerId, new Customer(customerId, split[1], split[2], split[3]));
       }
       System.out.println(customerMap);

       Set<Integer> keySet = customerMap.keySet();
       System.out.println(keySet);
       Collection<Customer> values = customerMap.values();
       System.out.println(values);

        return  customerMap;
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
