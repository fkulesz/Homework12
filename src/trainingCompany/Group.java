package trainingCompany;

import java.util.Arrays;

public class Group {
    Trainer trainer;
    Student[] students;

    @Override
    public String toString() {
        return "Group{" +
                "trainer=" + trainer + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
