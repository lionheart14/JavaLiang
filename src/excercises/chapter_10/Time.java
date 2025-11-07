package excercises.chapter_10;

import java.util.Date;

public class Time {
    private final static long MILLISECONDS_IN_DAY = 86400000;
    private long hour;
    private long minute;
    private long second;

    public Time() {
        this(System.currentTimeMillis() % MILLISECONDS_IN_DAY);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(long milliseconds) {
        setTime(milliseconds % MILLISECONDS_IN_DAY);
    }

    private void setTime(long elapseTime) {
        long mil = elapseTime;
        
        hour = mil / 3600000;
        mil %= 3600000;

        minute = mil / 60000;
        mil %= 60000;

        second = mil / 1000;
        mil %= 1000; 
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", hour, minute, second);
    }
}
