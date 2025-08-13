package excercises.chapter_11;

import excercises.chapter_10.MyDate;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String adress, String phoneNumber, String eMailAdress, String office, double salary, MyDate dateHired, String title) {
        super(name, adress, phoneNumber, eMailAdress, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}
