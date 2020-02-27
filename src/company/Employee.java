package company;

public class Employee extends Person{

    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Wypłata " + salary);
    }

    public double getSalary() {
        return salary;
    }

}
