package excercises.chapter_13;

import excercises.chapter_11.GeometricObject;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

    private double side;

    public Octagon() {
        this(0);
    }

    public Octagon(double side) {
        this.side = side;
    }


    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Octagon(side);
    }

    @Override
    public int compareTo(Octagon o) {
        if(this.getArea() > o.getArea()) {
            return 1;
        } else if(this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }
}
