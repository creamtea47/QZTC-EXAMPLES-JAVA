package experiment.chapter4;

public class FamilyPerson {
    static String surname;
    String name;

    public static void setSurname(String surname) {
        FamilyPerson.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }
}
