package excercises.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        mergeTest();
    }

    /**
     * 7.1
     */
    public static void assignGrades() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        System.out.print("Enter " + n + " scores: ");
        int[] scores = new int[n];
        int bestScore = 0;

        for(int i = 0; i < n; i++) {
            scores[i] = input.nextInt();

            //best score
            if(scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        char[] grades = new char[n];
        for(int i = 0; i < n; i++) {
            if(scores[i] >= bestScore - 5 ) {
                grades[i] = 'A';
            } else if(scores[i] >= bestScore - 10) {
                grades[i] = 'B';
            } else if(scores[i] >= bestScore - 15) {
                grades[i] = 'C';
            } else if(scores[i] >= bestScore - 20) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.printf("Student %d score is %d and grade is %c \n", i, scores[i], grades[i]);
        }
    }

    /**
     * 7.9
     */

    public static void prompt() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = input.nextInt(); 
        }

        System.out.println("The distinct numbers are: " + Arrays.toString(eliminateDuplicates(array)));
        // System.out.println("Sorted array is: " + Arrays.toString(bubbleSort(array)));
        // System.out.println("The mean is " + mean(array));
        // System.out.println("The standard deviation is " + deviation(array));
        // System.out.println("The reversed array is: " + Arrays.toString(reverseA(array)));
        // System.out.println("The maximum number is: " + max(array));
    }

    public static double max(double[] array) {
        double max = 0;
        for (double d : array) {
            if(d > max) {
                max = d;
            }
        }

        return max;
    }

    /**
     * 7.10
     */
    public static int indexOfLargestElement(double[] array) {
        int index = 0;
        double max = max(array);

        for(int i = 0; i < array.length; i++) {
            if(max == array[i]) {
                index = i;
            }
        }
        return index;
    }

    /**
     * 7.12
     */
    public static double[] reverseA(double[] array) {
        double[] reversedArray = new double[array.length];
        for(int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    /**
     * 7.11
     */
    public static double deviation(double[] x) {
        double deviation = 0;
        for (double d : x) {
            deviation += Math.pow(d - mean(x), 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }

    public static double mean(double[] x) {
        double mean = 0;
        for (double d : x) {
            mean += d;
        }
        return mean / x.length;
    }


    /**
     * 7.18
     */
    public static double[] bubbleSort(double[] n) {
        double[] s = n.clone();
        boolean comparison = true;

        while(comparison == true) {
            comparison = false;
            for(int i = 0; i < n.length - 1; i++) {
                if(s[i] < s[i + 1]) {
                    double temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;
                    comparison = true;
                }
            }
        }
        return s;
    }

    public static int[] bubbleSort(int[] n) {
        int[] s = n.clone();
        boolean comparison = true;

        while(comparison == true) {
            comparison = false;
            for(int i = 0; i < n.length - 1; i++) {
                if(s[i] < s[i + 1]) {
                    int temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;
                    comparison = true;
                }
            }
        }
        return s;
    }

    /**
     * 7.19
     */
    public static boolean isSorted(int[] list) {
        for(int i = 1; i < list[0]; i++) {
            if(list[i] < list[i + 1]) {
                return false;
            } 
        }
        return true;
    }

    /**
     * 7.15
     */
    public static int[] eliminateDuplicates(int[] list) {
        int[] returnList = new int[list.length];
        boolean duplicate = false;
        for(int i = 0; i < list.length; i++) {
            for (int n : returnList) {
                if(list[i] == n) {
                    duplicate = true;
                    break;
                }
            }

            if(duplicate == false) {
                returnList[i] = list[i];
            }

            duplicate = false;
        }
        return returnList;
    }

    /**
     * 7.31
     */ 
    public static void mergeTest() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int listSize1 = input.nextInt();
        int[] list1 = new int[listSize1];
        for(int i = 0; i < listSize1; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2 size and contents: ");
        int listSize2 = input.nextInt();
        int[] list2 = new int[listSize2];
        for(int i = 0; i < listSize2; i++) {
            list2[i] = input.nextInt();
        }

        System.out.println("list1 is " + Arrays.toString(list1));
        System.out.println("list2 is " + Arrays.toString(list2));

        System.out.println("The merged list is " + Arrays.toString(merge(list1, list2)));
    }
    
    // solve with 3 pointers 
    public static int[] merge(int[] list1, int[] list2) {
        int[] sList1 = bubbleSort(list1);
        int[] sList2 = bubbleSort(list2);
        int[] mergedList = new int[sList1.length + sList2.length];

        for(int i = 0; i < mergedList.length; i++) {
            if(sList1[0] <= sList2[0]) {
                mergedList[i] = sList1[0];
                queue(sList1);
            } else {
                mergedList[i] = sList2[0];
                queue(sList2);
            }
        }

        return mergedList;
    }

    public static void queue(int[] list) {
        for(int i = 0; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }
    }


    /**
     * 7.32
     */
    public static void partitionTest() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the list size: ");
        int listSize = input.nextInt();
        System.out.print("Enter list content: ");
        int[] list = new int[listSize];
        for(int i = 0; i < listSize; i++) {
            list[i] = input.nextInt();
        }

        System.out.print("After the partition, the list is ");

    }

    //zwei pointer ansatz
    // public static int partition(int[] list) {
    //         int pivot = list[0];
    //         int newListIndexLeft = 0;
    //         int newListIndexRight = list.length - 1;
    //         for(int i = 1; i < list.length; i++) {
    //             int temp = list[i];
    //             if(list[i] <= pivot) {
    //                 temp = list[newListIndexLeft];
    //                 list[newListIndexLeft] = list[i];
    //                 newListIndexLeft++;
    //             } else {
    //                 newList[newListIndexRight] = list[i];
    //                 newListIndexRight--;
    //             }
    //         }
    //         newList[newListIndexLeft] = pivot;
    //         return newListIndexLeft;
    // }
}
