package excercises.chapter_13;

import excercises.chapter_11.GeometricObject;

public class Exercise13_12 {
    public static void main(String[] args) {
        
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject geometricObject : a) {
            sum += geometricObject.getArea();
        }
        return sum;
    }
}
