package excercises.chapter_13;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Exercise13_04 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = Integer.parseInt(args[1]);
        int month = Integer.parseInt(args[0]) - 1;

        calendar.set(year, month, 1);

        printMonth(calendar);
    }

    /** Print the calendar for a month in a year */
    public static void printMonth(Calendar calendar) {
        // Print the headings of the calendar
        printMonthTitle(calendar);

        // Print the body of the calendar
        printMonthBody(calendar);
    }

    /** Print the month title, e.g., March 2012 */
    public static void printMonthTitle(Calendar calendar) {
        System.out.println(" " + getMonthName(calendar)
                + " " + calendar.get(Calendar.YEAR));
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    /** Get the English name for the month */
    public static String getMonthName(Calendar calendar) {
        return calendar.getDisplayName(calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
    }

    /** Print month body */
    public static void printMonthBody(Calendar calendar) {
        // Get start day of the week for the first date in the month
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);

        // Get number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(calendar);

        // Pad space before the first day of the month
        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    "); // Use 4 spaces for better formatting

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }

    /** Get the number of days in a month */
    public static int getNumberOfDaysInMonth(Calendar calendar) {
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
