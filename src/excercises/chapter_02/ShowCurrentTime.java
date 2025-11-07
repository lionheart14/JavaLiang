package excercises.chapter_02;

import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        
        int offset = input.nextInt();

        float totalMilliseconds = System.currentTimeMillis();
        float totalSeconds = totalMilliseconds / 1000;
        float totalMinutes = totalSeconds / 60;

        float currentSecond = totalSeconds % 60;
        float currentMinute = totalMinutes % 60;

        float totalHours = totalMinutes % 60;
        float currentHour = totalHours % 24 + offset;

        System.out.println("Current time is " + currentHour + ":"
        + currentMinute + ":" + currentSecond + " GMT");
    }
}

