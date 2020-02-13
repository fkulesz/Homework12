package trainingCompany;

public class Student extends Person {
    private String levelOfEducation;

    @Override
    public String toString() {
        return "Student{" +
                " imie= " + getFirstName() +
                " nazwisko= " + getLastName() +
                " pesel " + getPesel() +
                " adres "  + getAddress() +
                " levelOfEducation='" + levelOfEducation + '\'' +
                '}';
    }

    public String getLevelOfEducation() {
        return levelOfEducation;
    }

    public void setLevelOfEducation(String levelOfEducation) {
        this.levelOfEducation = levelOfEducation;
    }
}
