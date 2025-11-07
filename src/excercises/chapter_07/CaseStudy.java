package excercises.chapter_07;

import java.util.Scanner;

public class CaseStudy {
    public static void main(String[] args) {
        deckOfCards();
    }

    /**
     * 7.3
     */
    public static void analyseNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
        
        System.out.print("Enter the items: ");
        for(int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;
        int cnt = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > average) {
                cnt++;
            }
        }

        System.out.println("Average is: " + average);
        System.out.println("Numbers greater than average: " + cnt);
    }

    /**
     * 7.4
     */
    public static void deckOfCards() {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for(int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for(int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        for(int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.printf("Card number %-2d: %s of %s\n", deck[i], rank, suit);
        }
    }
}
