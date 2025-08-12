package excercises.chapter_11;

public class TestClass {
    public static void main(String[] args) {
        triangleTest();
    }

    public static void triangleTest() {
        Triangle triangle = new Triangle(5, 5, 5);
        System.out.println(triangle.toString());
        
        triangle.setColor("red");
        triangle.setFilled(true);
        System.out.println(triangle.isFilled());
    }
}
