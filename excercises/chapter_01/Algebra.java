package excercises.chapter_01;

public class Algebra {
    public static void main(String[] args) {
        Algebra algebra = new Algebra();
        algebra.solve();
    }

    public void solve() {
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        String res = String.format("Value for x: %f, y: %f", x, y);
        System.out.println(res);
    }
}
