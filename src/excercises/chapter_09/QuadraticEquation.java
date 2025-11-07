package excercises.chapter_09;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        if(getDiscriminant() >= 0) {
            return (-1 * b + Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if(getDiscriminant() >= 0) {
            return (-1 * b - Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return 0;
        }
    }
}
