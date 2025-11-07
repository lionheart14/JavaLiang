package excercises.chapter_13;

import excercises.chapter_11.GeometricObject;

public class Square extends GeometricObject implements Colorable{
    private double side;

    public Square() {
        this(0);
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    
}
