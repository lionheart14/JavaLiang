package excercises.chapter_13;

import java.util.ArrayList;

public class Exercise13_03 {
    public static void main(String[] args) {
        
    }

    public static void sort(ArrayList<Number> list) {
        ArrayList<Number> sortedList = new ArrayList<>();

        int originalSize = list.size();

        for(int i = 0; i < originalSize; i++) {

            Double min = list.get(i).doubleValue();
            int minIndex = i;

            for(int j = 1; j < list.size(); j++) {
                Double element = list.get(j).doubleValue();
                if(element < min) {
                    min = element;
                    minIndex = j;
                }
            }
            Number minObject = list.remove(minIndex);
            sortedList.add(minObject);
        }
        
        list.clear();
        list.addAll(sortedList);
    }
}
