package excercises.chapter_11;

import java.util.ArrayList;
import java.util.Date;

import excercises.chapter_10.Circle2D;

public class Exercises {
    public static void main(String[] args) {
        toStringShuffle();
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

    public static void toStringShuffle() {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(new Date());
        list.add(new Circle2D());
        list.add(new Triangle());

        for (Object object : list) {
            System.out.println(object.toString());
        }
    }
}
