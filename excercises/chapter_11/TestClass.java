package excercises.chapter_11;

import excercises.chapter_10.MyDate;
import excercises.chapter_09.Account;

public class TestClass {
    public static void main(String[] args) {
        accountTest();
    }

    public static void triangleTest() {
        Triangle triangle = new Triangle(5, 5, 5);
        System.out.println(triangle.toString());
        triangle.setColor("red");
        triangle.setFilled(true);
        System.out.println(triangle.isFilled());
    }

    public static void universityTest() {
        Person max = new Student("Max", "Werner Heisenberg Weg 120, 85579 Neubiberg", "015123244334", "max.mustermann@gmail.com", Student.SOPHOMORE);
        System.out.println(max.toString());
        Person frank = new Employee("Frank", null, null, null, null, 0, new MyDate(2025, 3, 21));
        System.out.println(frank.toString());
    }

    public static void accountTest() {
        Account savings = new SavingsAccount(0, 1000);
        savings.withdraw(1001);
        System.out.println(savings.toString());

        Account checking = new CheckingAccount(1, 1500, 500);
        checking.withdraw(1600);
        System.out.println(checking.getBalance());
        checking.withdraw(1000);
        System.out.println(checking.toString());
    }
}
