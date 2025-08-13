package excercises.chapter_11;

import excercises.chapter_10.MyDate;

public class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String adress, String phoneNumber, String eMailAdress, String office, double salary, MyDate dateHired) {
        super(name, adress, phoneNumber, eMailAdress);
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOffice: " + office + "\nSalary: " + salary + "\nDate Hired: " + dateHired.toString();
    }
}
