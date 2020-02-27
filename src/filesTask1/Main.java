package filesTask1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       Employee[] employees = FileReader.readsEmployeeDetailsFromFile("plik.txt");
       String mediumSallary = EmployeeMethods.mediumSallaryInCompany(employees);
       String minSallary = EmployeeMethods.getMinSallaryInCompany(employees);
       String maxSallary = EmployeeMethods.getMaxSallaryInCompany(employees);
       String[] employeesInDepartments = EmployeeMethods.countEmployeesInDepartment(employees);
        FileWriterResult.saveResultToFile(mediumSallary, minSallary, maxSallary, employeesInDepartments, "result.txt");

    }
}
