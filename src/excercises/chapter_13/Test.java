package excercises.chapter_13;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon o = new Octagon(5);
        Octagon o2 = (Octagon) o.clone();
    }
}
