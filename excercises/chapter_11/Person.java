package excercises.chapter_11;

public class Person {
    protected String name;
    protected String adress;
    protected String phoneNumber;
    protected String eMailAdress;

    public Person(String name, String adress, String phoneNumber, String eMailAdress) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.eMailAdress = eMailAdress;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAdress: " + adress + "\nPhone Number: " + phoneNumber + "\nE-mail Adress: " + eMailAdress;
    }
}
