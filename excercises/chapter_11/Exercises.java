package excercises.chapter_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import excercises.chapter_10.Circle2D;

public class Exercises {
    public static void main(String[] args) {
        testBinPacking  ();
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

    public static void removeDuplicate(ArrayList<Integer> list) {
        final int LIST_SIZE = list.size();
        for(int i = 0; i < LIST_SIZE; i++) {
            int CURRENT_ELEMENT = list.get(i);
            Iterator<Integer> listIterator = list.iterator();
            for(int j = 0; j < LIST_SIZE; j++) {
                if(i == j) continue;

                if(CURRENT_ELEMENT == list.get(j)) {
                    list.set(j, 0);
                }
            }
        }

        for (Integer integer : list) {
                if(integer == 0) {
                    list.remove(integer);
                }
            }
    }

    public static void testRemoveDuplicate() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        removeDuplicate(list);
        System.out.print("The distinct integers are ");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<>();
        for (Integer integer : list1) {
            list3.add(integer);
        }

        for (Integer integer : list2) {
            list3.add(integer);
        }

        return list3;
    }

    public static void testUnion() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter five integers for list1: ");
        for(int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
        
        System.out.print("Enter five integers for list2: ");
        for(int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        ArrayList<Integer> list3 = union(list1, list2);
        System.out.print("The combined list is ");
        for (Integer integer : list3) {
            System.out.print(integer + " ");
        }
    }

    //TODO
    public static void areaOfConvexPolygon() {
        
    }

    public static ArrayList<Character> toCharacterArray(String string) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
        }
        return list;
    }

    public static void testToCharacterArray() {
        ArrayList<Character> result = toCharacterArray("BERSERK");
        System.out.print("Chracters in string ");
        for (Character character : result) {
            System.out.print(character + " ");
        }
    }

    public static void testBinPacking() {
        Scanner input = new Scanner(System.in);
        final int CONTAINER_WEIGHT = 10;
        System.out.print("Enter the number of objects: ");
        int num = input.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            numbers.add(input.nextInt());
        }

        int currentSum = 0;
        int[] currentNumbers = new int[10];
        int contatinerNumber = 1;

        for (Integer n : numbers) {
            if(currentSum + n > 10) {
                System.out.print("Container " + contatinerNumber + " contains objects with weight ");
                for (int i : currentNumbers) {
                    System.out.print(i + " ");
                }
                currentNumbers = new int[10];
                currentSum = 0;
            }

            currentSum += n;
        }



        
    }



}
