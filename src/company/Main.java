package company;

public class Main {
    public static void main(String[] args) {
        Employee[] persons = new Employee[3];
        Director director = new Director("Filip", "kulesz", 1230, 470);
        Employee employee1 = new Employee("Kon", "konioaaty", 999);
        Employee employee2 = new Employee("pies", "psowaty", 567);
        persons[0] = director;
        persons[1] = employee1;
        persons[2] = employee2;

        Salary.countSalary(persons);
        Salary.checkSalary(persons, 600);
    }
}
