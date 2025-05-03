package excercises.chapter_04;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();
        exercises.enterThreeCountries();
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

    /**
     * 4.18
     */
    public void studentStatus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String user = input.nextLine();

        char majorInd = user.charAt(0);
        char statusInd = user.charAt(1);
        String major = "";
        String status = "";

        switch(majorInd) {
            case 'I': major = "Information Management"; break;
            case 'C': major = "Computer Science"; break;
            case 'A': major = "Accounting"; break;
            default: System.out.println("Invalid input"); return;
        }

        switch(statusInd) {
            case '1': status = "Freshman"; break;
            case '2': status = "Sophomore"; break;
            case '3': status = "Junior"; break;
            case '4': status = "Senior"; break;
            default: System.out.println("Invalid input"); return;
        }
        System.out.printf("%s %s", major, status);
    }

    /**
     * 4.20 
     */
    public void processString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        int length = string.length();

        System.out.printf("Length: %d \nLast character: %c", length, string.charAt(length - 1));
    }

    /**
     * 4.21
     */
    public void checkSSN() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String SSN = input.nextLine();

        if(SSN.length() != 11) {
            System.out.printf("%s is an invalid social security number", SSN);
        }

        char D1 = SSN.charAt(0);
        char D2 = SSN.charAt(1);
        char D3 = SSN.charAt(2);
        char S1 = SSN.charAt(3);
        char D4 = SSN.charAt(4);
        char D5 = SSN.charAt(5);
        char S2 = SSN.charAt(6);
        char D6 = SSN.charAt(7);
        char D7 = SSN.charAt(8);
        char D8 = SSN.charAt(9);
        char D9 = SSN.charAt(10);


        if(Character.isDigit(D1) && Character.isDigit(D2) && Character.isDigit(D3) &&
        S1 == '-' &&
        Character.isDigit(D4) && Character.isDigit(D5) &&
        S2 == '-' &&
        Character.isDigit(D6) && Character.isDigit(D7) &&
        Character.isDigit(D8) && Character.isDigit(D9)) {
            System.out.printf("%s is an valid social security number", SSN);
            return;
        }

        System.out.printf("%s is an invalid social security number", SSN);
    }

    /**
     * 4.22
     */
    public void checkSubstring() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();

        if(s1.contains(s2)) {
            System.out.printf("%s is a substring of %s", s2, s1);
        } else {
            System.out.printf("%s is not a substring of %s", s2, s1);
        }
    }

    /**
     * 4.23
     */
    public void showPayroll() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        double grossPay = hoursWorked * hourlyPayRate;
        double federalWithholding = grossPay * federalTax;
        double stateWithholding = grossPay * stateTax;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        double federalTaxPercent = federalTax * 100;
        double stateTaxPercent = stateTax * 100;


        System.out.printf("Employee Name: %s\n Hours Worked: %f\nPay Rate: $%f\nGross Pay: $%f\nDeductions:\n   Federal Withholding (%f%%): $%f\n   State Withholding (%f%%): $%f\n   Total Deduction: $%f\nNet Pay: $%f", name, hoursWorked, hourlyPayRate, grossPay, federalTaxPercent, federalWithholding, stateTaxPercent, stateWithholding, totalDeduction, netPay);
    }

    /**
     * 4.24
     */
    public void enterThreeCountries() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first country: ");
        String firstCountry = input.nextLine();

        System.out.print("Enter the second country: ");
        String secondCountry = input.nextLine();

        System.out.print("Enter the third country: ");
        String thirdCountry = input.nextLine();
        String temp;

        if(firstCountry.compareTo(secondCountry) > 0) {
            temp = firstCountry;
            firstCountry = secondCountry;
            secondCountry = temp;
        }  

        if(firstCountry.compareTo(thirdCountry) > 0) {
            temp = firstCountry;
            firstCountry = thirdCountry;
            thirdCountry = temp;
        }

        if(secondCountry.compareTo(thirdCountry) > 0) {
            temp = secondCountry;
            secondCountry = thirdCountry;
            thirdCountry = temp;
        }

        System.out.printf("The three countries in ascending order are %s %s %s", firstCountry, secondCountry, thirdCountry);
    }
    
}
