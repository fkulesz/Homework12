package trainingCompany;

public class Trainer extends Person {
    private int yearsOfExperience;
    private String programmingLanguage;


    @Override
    public String toString() {
        return "Trener {" +
                " imie= " + getFirstName() + '\'' +
                " nazwisko= " + getLastName() + '\'' +
                " pesel " + getPesel() + '\'' +
                " adres "  + getAddress() +  '\'' +
                " yearsOfExperience='" + yearsOfExperience + '\'' +
                " programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
