package trainingCompany;

public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.setFirstName("Filip");
        trainer.setLastName("Kulesz");
        trainer.setAddress("Wrocław");
        trainer.setPesel("12345");
        trainer.setProgrammingLanguage("Java");
        trainer.setYearsOfExperience(10);

        Student student1 = new Student();
        student1.setFirstName("Adam");
        student1.setLastName("Malysz");
        student1.setAddress("Lodz");
        student1.setPesel("1234");
        student1.setLevelOfEducation("basic");

        Student student2 = new Student();
        student2.setFirstName("Kamil");
        student2.setLastName("Stoch");
        student2.setAddress("Katowice");
        student2.setPesel("1234");
        student2.setLevelOfEducation("advanced");

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;


        Group group = new Group();
        group.setStudents(students);
        group.setTrainer(trainer);

        System.out.println("Grupa zajeciowa pierwsza : " + group.toString());

    }
}
