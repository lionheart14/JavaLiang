package excercises.chapter_11;

import java.util.ArrayList;

public class Exercises {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // numbers.add(4);
        // numbers.add(10020202);
        // numbers.add(4123);
        // numbers.add(41);
        System.out.println(maximumElementInArrayList(numbers));
    }

    public static Integer maximumElementInArrayList(ArrayList<Integer> list) {
        if(list.isEmpty()) return null;
        
        int max = list.get(0);
        for (Integer integer : list) {
            if(integer > max) {
                max = integer;
            }
        }
        return max;
    }
}
