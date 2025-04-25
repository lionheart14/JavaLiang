package excercises.chapter_04;

public class CheckPoint {
    public static void main(String[] args) {
        CheckPoint cp = new CheckPoint();
        cp.randomInteger();
    }

    /**
     * 4.2.5
     */
    public void randomInteger() {
        int randInt = 34 + (int) (Math.random() * (55 - 34));
        System.out.println(randInt);
    }
}
