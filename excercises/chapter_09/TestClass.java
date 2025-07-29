package excercises.chapter_09;

public class TestClass {
    public static void main(String[] args) {
        testRectangle();
    }

    public static void testRectangle() {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.printf("Width: %f\n"+
                           "Height: %f\n"+
                           "Area: %f\n" +
                           "Perimteter: %f\n", 
                           r1.getWidth(), r1.getHeight(), r1.getArea(), r1.getPerimeter());

        System.out.printf("Width: %f\n"+
                           "Height: %f\n"+
                           "Area: %f\n" +
                           "Perimteter: %f", 
                           r2.getWidth(), r2.getHeight(), r2.getArea(), r2.getPerimeter());
    }


}
