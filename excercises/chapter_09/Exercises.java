package excercises.chapter_09;

import java.util.GregorianCalendar;

public class Exercises {
    public static void main(String[] args) {
        gregorianCalendar();
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
}
