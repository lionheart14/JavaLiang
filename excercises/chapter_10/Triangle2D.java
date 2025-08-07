package excercises.chapter_10;

public class Triangle2D {
    private MyPoint p1, p2, p3;

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        return Math.abs(0.5 * p1.getX() * (p2.getY() - p3.getY()) + 
                              p2.getX() * (p3.getY() - p1.getY()) +
                              p3.getX() * (p1.getY() - p2.getX()));
    }

    public double getPerimeter() {
        return MyPoint.distance(p1, p2) + MyPoint.distance(p2, p3) + MyPoint.distance(p3, p1);
    }

    public boolean contains(MyPoint p) {
        double check1 = (p2.getX() - p1.getX()) * (p.getY() - p1.getY()) - (p.getX() - p1.getX()) * (p2.getY() - p1.getY());
        double check2 = (p3.getX() - p2.getX()) * (p.getY() - p2.getY()) - (p.getX() - p2.getX()) * (p3.getY() - p2.getY());
        double check3 = (p1.getX() - p3.getX()) * (p.getY() - p3.getY()) - (p.getX() - p3.getX()) * (p1.getY() - p3.getY());

        boolean allPositive = (check1 >= 0 && check2 >= 0 && check3 >= 0);
        boolean allNegative = (check1 <= 0 && check2 <= 0 && check3 <= 0);

        return allPositive || allNegative;
    }

    public boolean contains(Triangle2D t) {
        return this.contains(t.getP1()) && this.contains(t.getP2()) && this.contains(t.getP3());
    }

    public boolean overlaps(Triangle2D t) {
        return false;
    } 

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }
}
