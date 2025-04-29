package excercises.chapter_04;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();
        exercises.daysOfMonth();
    }
    /** 
     * 4.1
     */
    public void areaOfPentagon() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.println("The are of the pentagon is " + area);
    }

    /**
     * 4.2
     */
    public void greatCircleDistance() {
        Scanner input = new Scanner(System.in);
        final double RADIUS = 6371.01;

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());

        double d = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.printf("The distance between the two points is %.2f km", d);
    }

    /**
     * 4.5
     */
    public void areaOfPolygon() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        System.out.printf("The area of the polygon is %.2f", area);
    }

    /**
     * 4.6
     */
    public void randomPointsOnCircle() {
        final int RADIUS = 40;
        double alpha = Math.toRadians((int) (Math.random() * 360));
        double x = RADIUS * Math.cos(alpha);
        double y = RADIUS * Math.sin(alpha);
        double bravo = Math.toRadians((int) (Math.random() * 360));

        double charlie = Math.toRadians((int) (Math.random() * 360));
    }

    /**
     * 4.8, 4.9
     */
    public void asciiCode() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = input.nextLine().charAt(0);
        int ascii = (int) c;

        System.out.printf("The ASCII code for character %c is %d", c , ascii);
    }

    /**
     * 4.11
     */
    public void binaryToDecimal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary digits (0000 to 1111): ");
        String binary = input.nextLine();

        char firstDigit = binary.charAt(0);
        char secondDigit = binary.charAt(1);
        char thirdDigit = binary.charAt(2);
        char fourthDigit = binary.charAt(3);

        int decimal = 0;
        if(firstDigit == '1') {
            decimal += 8;
        }
        if(secondDigit == '1') {
            decimal += 4;
        }
        if(thirdDigit == '1') {
            decimal += 2;
        }
        if(fourthDigit == '1') {
            decimal += 1;
        }

        System.out.printf("The decimal value is %d", decimal);
    }

    /**
     * 4.12
     */
    public void hexToBinary() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the hex digit: ");
        char c = input.nextLine().charAt(0);

        //Konvertieren des Hex codes in decimal
        int decimal = Character.digit(c, 16);

        if(decimal == -1) {
            System.out.printf("%c is an inavalid input", c);
            return;
        }

        //Konvertieren der Dezimalzahl in Binary
        String binary = Integer.toBinaryString(decimal);

        System.out.printf("The binary value is %s", binary);
    }

    /**
     * 4.13
     */
    public void vowelOrConsonant() {
        Scanner input = new Scanner(System.in);
        String vowels = "aeiou";
        System.out.print("Enter a letter: ");
        String c = input.nextLine();

        if(c.length() > 1) {
            System.out.println("You can only enter one letter");
            return;
        }

        if(vowels.contains(c)) {
            System.out.printf("%s is a vowel", c);
        } else {
            System.out.printf("%s is a consonant", c);
        }
    }

    /**
     * 4.14
     */
    public void convertLetterToNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        char c = input.nextLine().charAt(0);
        int numeric = -1;

        switch(c) {
            case 'A': numeric = 4; break;
            case 'B': numeric = 3; break;
            case 'C': numeric = 2; break;
            case 'D': numeric = 1; break;
            case 'F': numeric = 0; break;
        }

        if(numeric == -1) {
            System.out.println("%c is an invalid grade");
            return;
        }

        System.out.printf("The numeric value for grade B is %d", numeric);
    }

    /**
     * 4.15
     */
    public void phoneKeyPads() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char c = input.nextLine().toLowerCase().charAt(0);
        int number = -1;

        if(c < 97 || c > 122) {
            System.out.printf("%c is an invalid input", c);
            return;
        }

        if(c >= 119) {
            number = 9;
        } else if(c >= 116) {
            number = 8;
        } else if(c >= 112) {
            number = 7;
        } else if(c >= 109) {
            number = 6;
        } else if(c >= 106) {
            number = 5;
        } else if(c >= 103) {
            number = 4;
        } else if(c >= 100) {
            number = 3;
        } else {
            number = 2;
        }

        if(number == -1) {
            System.out.println("Error");
            return;
        }

        System.out.printf("The corresponding number is %d", number);
    }

    /**
     * 4.16
     */
    public void randomCharacter() {
        int ascii = (int) (Math.random() * 25 + 97);
        System.out.printf("Random letter: %c", ascii);
    }

    /**
     * 4.17
     */
    public void daysOfMonth() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String month = input.nextLine();
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int days = -1;
        switch(month) {
            case "Jan": days = 31; break;
            case "Feb": days = 29; if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) days = 28; break;
            case "Mar": days = 31; break;
            case "Apr": days = 30; break;
            case "May": days = 31; break;
            case "Jun": days = 30; break;
            case "Jul": days = 31; break;
            case "Aug": days = 31; break;
            case "Sep": days = 30; break;
            case "Oct": days = 31; break;
            case "Nov": days = 30; break;
            case "Dec": days = 31; break;
            default: System.out.printf("%s is not a correct month name", month); return;
        }

        System.out.printf("%d %s has %d days", year, month, days);
    }
}
