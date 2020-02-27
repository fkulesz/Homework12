package filesTask1;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMethods {
    public static String mediumSallaryInCompany(Employee[] employees){
        int allSallaries = 0;
        int mediumSallary = 0;
        String result;
        for (int i = 0; i < employees.length ; i++) {
            allSallaries += employees[i].getSallary();
        }
        mediumSallary = allSallaries/employees.length;
        result = "srednie wynagrodzenie pracownikow : " + mediumSallary;
        System.out.println("srednie wynagrodzenie pracownikow : " + mediumSallary);

        return result;
    }

    public static String getMinSallaryInCompany(Employee[] employees){
        int minSallary = employees[0].getSallary();
        String result;
        for (int i = 0; i < employees.length ; i++) {
            minSallary = Math.min(minSallary, employees[i].getSallary());
        }
        result = "minimalne wynagrodzenie pracownikow : " + minSallary;
        System.out.println("minimalne wynagrodzenie pracownikow : " + minSallary);

        return result;
    }
    public static String getMaxSallaryInCompany(Employee[] employees){
        int maxSallary = employees[0].getSallary();
        String result;

        for (int i = 0; i < employees.length ; i++) {
            maxSallary = Math.max(maxSallary, employees[i].getSallary());
        }
        result = "maksymalne wynagrodzenie pracownikow : " + maxSallary;
        System.out.println("maksymalne wynagrodzenie pracownikow : " + maxSallary);

        return result;
    }

    private static ArrayList getListOfUniqueDepartments(Employee[] employees){
        List<String> listOfAllDepartments = new ArrayList<>();
        for (int i = 0; i < employees.length ; i++) {
            listOfAllDepartments.add(employees[i].getDepartment());
        }
        ArrayList listWithUniqueDepartments = (ArrayList) listOfAllDepartments.stream().distinct().collect(Collectors.toList());

        return listWithUniqueDepartments;
    }

     public static String[]  countEmployeesInDepartment( Employee[] employees){
        ArrayList listWithUniqueDepartments = getListOfUniqueDepartments(employees);
        int employeesInDepartment = 0;
        String[] resultTab = new String[listWithUniqueDepartments.size()];
         for (int i = 0; i < listWithUniqueDepartments.size(); i++) {
             for (int j = 0; j < employees.length ; j++) {
                 if(employees[j].getDepartment().equals(listWithUniqueDepartments.get(i))){
                     employeesInDepartment++;
                 }

             }
             resultTab[i] = "liczba osob w : " + listWithUniqueDepartments.get(i) +  " to " + employeesInDepartment;
             System.out.println("liczba osob w : " + listWithUniqueDepartments.get(i) +  " to " + employeesInDepartment);
             employeesInDepartment = 0;
         }

         return resultTab;
     }

}
