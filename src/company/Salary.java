package company;

public class Salary {
    public static double countSalary(Employee[] employees){
        double allSalaries = 0;
        for (Employee employee: employees) {
            allSalaries += employee.getSalary();
            employee.showInfo();
        }

        return allSalaries;

    }
    public static int checkSalary(Employee[] employees, double mediumSallary){
        int count = 0;
        for (Employee employee: employees ) {
            if(employee.getSalary() > mediumSallary){
                count++;
            }
        }
        System.out.println("Liczba pracownikow z zarobkami większymi od " + mediumSallary + " to " + count);
        return  count;
    }
}
