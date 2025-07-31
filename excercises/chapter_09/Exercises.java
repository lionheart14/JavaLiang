package excercises.chapter_09;

import java.util.GregorianCalendar;
import java.util.Random;

public class Exercises {
    public static void main(String[] args) {
        random();
    }

    /**
     * 9.5
     */
    public static void gregorianCalendar() {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeInMillis(1234567898765L);
        System.out.println(gc.get(GregorianCalendar.YEAR));
        System.out.println(gc.get(GregorianCalendar.MONTH));
        System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH));
    }

    /**
     * 9.4
     */
    public static void random() {
        Random r = new Random(1000);
        for(int i = 0; i < 50; i++) {
            System.out.println(r.nextInt(100));
        }
    }
}
