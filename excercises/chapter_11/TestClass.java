package excercises.chapter_11;

public class TestClass {
    public static void main(String[] args) {
        universityTest();
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
    }
}
