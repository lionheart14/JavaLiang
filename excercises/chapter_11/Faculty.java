package excercises.chapter_11;

public class Faculty extends Employee {
    protected double officeHours;
    protected String rank;

    public Faculty(String name, String adress, String phoneNumber, String eMailAdress, String office, double salary, MyDate dateHired, double officeHours, String rank) {
        super(name, adress, phoneNumber, eMailAdress, office, salary, dateHired);
        this.officeHours = officeHours; 
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
    }
}
