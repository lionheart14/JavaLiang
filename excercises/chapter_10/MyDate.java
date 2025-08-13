package excercises.chapter_10;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private GregorianCalendar calendar;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year; 
        this.month = month;
        this.day = day;
    }

    private void setDate(long elapsedTime) {
        calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(0);
        calendar.setTimeInMillis(elapsedTime);

        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public void setElapsedTime(long elapsedTime) {
        setDate(elapsedTime);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return String.format("%d.%d.%d", day, month, year);
    }
}
