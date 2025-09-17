package excercises.chapter_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import excercises.chapter_10.Circle2D;

public class Exercises {
    public static void main(String[] args) {
        removeDuplicateTest();
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

    public static void shuffle(ArrayList<Integer> list) {
       for(int i = 0; i < list.size(); i++) {
        int temp = list.get(i);
        int index = (int) (Math.random() * list.size());
        list.set(i, list.get((index)));
        list.set(index, temp);
       }
    }

    public static void fillMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        ArrayList<Integer> rowCnt = new ArrayList<>();
        // rowCnt.add(matri)

        System.out.println("The random array is");
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (Double double1 : list) {
            sum += double1;
        }
        return sum;
    }

    public static void removeDuplicateTest() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());
        }

        removeDuplicate(numbers);

        System.out.print("The distinct integers are ");
        Iterator iterator = numbers.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> distinct = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if(distinct.contains(element)) {
                list.remove(i);
                i--;
            } else {
                distinct.add(element);
            }
        }
    }
}
