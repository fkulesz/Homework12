package filesTask1;

public class Employee {
    private String name;
    private String lastName;
    private String pesel;

    public String getDepartment() {
        return department;
    }

    public int getSallary() {
        return sallary;
    }

    private String department;
    private int sallary;

    public Employee(String name, String lastName, String pesel, String department, int sallary) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.department = department;
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", department='" + department + '\'' +
                ", sallary=" + sallary +
                '}';
    }
}
