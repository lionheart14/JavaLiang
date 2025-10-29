package excercises.chapter_13;

public class Complex implements Cloneable, Comparable<Complex>{
    private final int a;
    private final int b;

    public static void main(String[] args) {
        Complex c = new Complex();
        System.out.println(c.toString());
    }

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Complex(int a) {
        this(a, 0);
    }

    public Complex() {
        this(0, 0);
    }

    public Complex add(Complex c1, Complex c2) {
        return new Complex(c1.getA() + c2.getA(), c1.getB() + c2.getB());
    }

    public Complex sub(Complex c1, Complex c2) {
        return new Complex(c1.getA() - c2.getA(), c1.getB() - c2.getB());
    }

    public Complex mult(Complex c1, Complex c2) {
        return new Complex(c1.getA() * c1.getA() - c1.getB() * c2.getB(), c1.getB() * c2.getA() + c1.getA() * c2.getB());
    }

    public Complex div(Complex c1, Complex c2) {
        return new Complex();
    }

    public int getRealPart() {
        return -1;
    }

    public int getImaginaryPart() {
        return -1;
    
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        String s;
        if(b == 0) {
            s = String.valueOf(a);
        } else {
            s = a + " + " + b + "i";
        }
        return s;
    }

    @Override
    public int compareTo(Complex o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
