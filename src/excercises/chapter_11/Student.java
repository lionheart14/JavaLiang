package excercises.chapter_11;

public class Student extends Person{
    final static String FRESHMAN = "freshman";
    final static String SOPHOMORE = "sophomore";
    final static String JUNIOR = "junior";
    final static String SENIOR = "senior";
    protected String classStatus;

    public Student(String name, String adress, String phoneNumber, String eMailAdress, String classStatus) {
        super(name, adress, phoneNumber,eMailAdress);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nClass Status: " + classStatus;
    }

}
