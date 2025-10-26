package excercises.chapter_13;

import excercises.chapter_10.Circle2D;
import excercises.chapter_11.GeometricObject;

public class ComparableCircle extends Circle2D implements Comparable<GeometricObject>{

    public ComparableCircle() {
        this(0,0,1);
    }

    public ComparableCircle(double x, double y, double radius) {
        super(x, y, radius);
    }

    @Override
    public int compareTo(GeometricObject o) {
        if(this.getArea() > o.getArea()) {
            return 1;
        } else if(this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
