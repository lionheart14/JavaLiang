package excercises.chapter_13;

import java.util.ArrayList;

public class Exercise13_02 {
    public static void main(String[] args) {
        
    }

    public static void average(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        double average = sum / list.size();

        System.out.println(average);
    }
}
