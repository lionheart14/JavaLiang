package excercises.chapter_05;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();
        exercises.headsOrTails();
    }

    /**
     * 5.1
     */
    public void passOrFail() {
        Scanner input = new Scanner(System.in);
        int score;

        while (true) {
            System.out.print("Enter your score (-1 to exit): ");
            score = input.nextInt();

            if (score == -1) {
                System.out.println("Program terminated.");
                break;
            }

            if (score >= 60) {
                System.out.println("You pass the exam");
            } else {
                System.out.println("You don't pass the exam");
            }
        }
    }

    /**
     * 5.3
     */
    public void celsiusToFahrenheit() {
        System.out.printf("%-10s %10s\n", "Celsius", "Fahrenheit");
        for(int i = 0; i <= 100; i += 2) {
            int celsius = i;
            double fahrenheit = celsius * 9/5 + 32;
            System.out.printf("%-10d %10.1f\n", celsius, fahrenheit);
        }
    }

    /**
     * 5.4
     */
    public void inchToCentimeter() {
        System.out.printf("%-10s %10s\n", "Inches", "Centimetres");
        for(int i = 0; i <= 10; i++) {
            int inch = i;
            double centimetres = inch * 2.54;
            System.out.printf("%-10d %.2f\n", inch, centimetres);
        }
    }

    /**
     * 5.5 
     */ 
    public void celsiusToFahrenheitTable() {
        System.out.printf("%-12s %12s   |   %-12s %12s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");

        int fahrenheit2 = 20;
        for(int i = 0; i <= 100; i += 2) {
            int celsius1 = i;
            double fahrenheit1 = celsius1 * (9/5) + 32; 

            double celsius2 = (fahrenheit2 - 32) * (5/9.0);
            System.out.printf("%-12d %12.3f   |   %-12d %12.3f\n", celsius1, fahrenheit1, fahrenheit2, celsius2);
            fahrenheit2 += 5;
        }
    }

    /**
     * 5.6
     */
    public void squareMeterToPing() {
        System.out.printf("%-12s %12s   |   %-12s %12s\n", "Ping", "Square meter", "Square meter", "Ping");
        int squareMeter2 = 30;
        for(int ping = 10; ping <= 80; ping += 5) {
            double squareMeter1 = ping * 3.305;
            double ping2 = squareMeter2 / 3.305;
            System.out.printf("%-12d %12.3f   |   %-12d %12.3f\n", ping, squareMeter1, squareMeter2, ping2);
            squareMeter2 += 5;
        }
    }
    
    /**
     * 5.7
     */
    public void computeFutureTuition() {
        Scanner input = new Scanner(System.in);
        double tuition = 10000;
        final double INCREMENT = 1.06;
        for(int years = 1; years <= 10; years++) {
            tuition *= INCREMENT;
            System.out.printf("Tuition for %d year: %.2f\n", years, tuition);
        }
    }

    /**
     * 5.8
     */
    public void findHighestScore() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        String studentWithHighestScore = "dummy";
        int highestScore = -1;
        for(int i = 1; i <= numberOfStudents; i++) {
            System.out.printf("Enter name und score for student %d: ", i);
            String name = input.next();
            int score = input.nextInt();

            if(score > highestScore) {
                highestScore = score;
                studentWithHighestScore = name;
            }
        }
        
        System.out.printf("The student with the highest score is %s", studentWithHighestScore);
    }

    /**
     * 5.9
     */
    public void findTwoLowestScores() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        String studentWithLowestScore = "dummy";
        String studentWithSecondLowestScore = "dummyy";

        int lowestScore = -1;
        int secondLowestScore = -1;

        for(int i = 1; i <= numberOfStudents; i++) {
            System.out.printf("Enter name und score for student %d: ", i);
            String name = input.next();
            int score = input.nextInt();

            if(i == 1) {
                studentWithLowestScore = name;
                lowestScore = score;
            }

            if(i == 2) {
                studentWithSecondLowestScore = name;
                secondLowestScore = score;
            }

            if(score < lowestScore) {
                secondLowestScore = lowestScore;
                lowestScore = score;

                studentWithSecondLowestScore = studentWithLowestScore;
                studentWithLowestScore = name;
            }
        }
        
        System.out.printf("The student with the lowest score is %s\nThe student with the second lowest score is %s", studentWithLowestScore, studentWithSecondLowestScore);
    }

    /**
     * 5.10
     */
    public void findNumbersDivisibleBy3And4() {
        String numbersDivisibleBy3And4 = "";
        for(int number = 100; number <= 1000; number++) {
            if(number % 3 == 0 && number % 4 == 0) {
                numbersDivisibleBy3And4 = numbersDivisibleBy3And4 + number + " ";
            }
        }
        System.out.println(numbersDivisibleBy3And4);
    }

    /**
     * 5.11
     */
    public void findNumbersDivisibleBy3Or4ButNotBoth() {
        String numbersDivisibleBy3Or4ButNotBoth = "";
        int count = 0;
        for(int number = 100; number <= 200; number++) {
            if(count == 10) {
                numbersDivisibleBy3Or4ButNotBoth += "\n";
                count = 0;
            }
            
            if(number % 3 == 0 ^ number % 4 == 0) {
                numbersDivisibleBy3Or4ButNotBoth = numbersDivisibleBy3Or4ButNotBoth + number + " ";
                count++;
            }
        }
        System.out.println(numbersDivisibleBy3Or4ButNotBoth);
    }

    /**
     * 5.12
     */
    public void smallestNumber() {
        final int LIMIT = 12000;
        for(int number = 0; number < LIMIT; number++) {
            if(Math.pow(number, 3) > LIMIT) {
                System.out.printf("%d | %.0f", number, Math.pow(number, 3));
                break;
            }
        }
    }

    /**
     * 5.13
     */
    public void largestNumber() {
        final int LIMIT = 12000;
        int number = LIMIT;
        while(number != 0) {
            if(Math.pow(number, 2) < 12000) {
                System.out.printf("%d | %.0f", number, Math.pow(number, 2));
                break;
            }
            number--;
        }
    }

    /**
     * 5.14
     */
    public void greatestCommonDivisor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer n1: ");
        int n1 = input.nextInt();
        System.out.print("Enter integer n2: ");
        int n2 = input.nextInt();

        int d = n1 <= n2 ? n1 : n2; 

        while(d != 1) {
            if(n1 % d == 0 && n2 % d == 0) {
                System.out.printf("The greatest common divisor for %d and %d is %d", n1, n2, d);
                break;
            }
            d--;
        }

        if(d == 1) {
            System.out.printf("No commmon divisor for %d and %d", n1, n2);
        }
    }

    /**
     * 5.15
     */
    public void asciiCharacterTable() {
        int i = '!';
        int j = '~';
        int cnt = 0;
        for(int n = i; n <= j; n++) {
            char c = (char) n;
            System.out.print(c + " ");
            cnt++;

            if(cnt == 10) {
                cnt = 0;
                System.out.println();
            }
        }
    }

    /**
     * 5.16
     */
    public void findFactorsOfInteger() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        String factors = "";

        while (n != 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    factors = factors + i;
                    n = n / i;

                    if (n != 1) {
                        factors = factors + ", ";
                    }
                break;
                }
            }
        }
        System.out.println(factors);
    }
    
    /**
     * 5.17
     */
    public void displayPyramid() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        while(lines < 1 || lines > 15) {
            System.out.print("Enter the number of lines (1 - 15): ");
            lines = input.nextInt();
        }

        for(int i = 0; i < 7; i++) {
            int numbersPerLine = lines * 2 - 1;
            int middle = lines;
            int number = lines;
            for(int j = 1; j <= numbersPerLine; j++) {
                if(j < middle) {
                    System.out.print(number + " ");
                    number--;
                } else {
                    System.out.print(number + " " );
                    number++;
                }
            }
            lines--;
            System.out.println();
        }
    }

    /**
     * 5.18
     */
    public void differentPatterns() {
        Scanner input = new Scanner(System.in);
        int pattern = -1;
        final int NUMBERS_PER_LINE = 6;

        while(pattern < 1 || pattern > 4) {
            System.out.print("Enter number of pattern (1-4): ");
            pattern = input.nextInt();
        }

        switch(pattern) {
            case 1: patternA(NUMBERS_PER_LINE); break;
            case 2: patternB(NUMBERS_PER_LINE); break;
            case 3: patternC(NUMBERS_PER_LINE); break;
            case 4: patternD(NUMBERS_PER_LINE); break;
            default: System.out.println("Error");
        }
    }

    public void patternA(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }

    public void patternB(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }

    public void patternC(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.printf( "%" + n + "c", '*');
            }
            System.out.println();
        }
    }

    public void patternD(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }

    public void pyramidPattern() {
        int maxRows = 8;
        int base = 3;

        int maxValue = (int) Math.pow(base, maxRows - 1);
        int cellWidth = String.valueOf(maxValue).length() + 2;
        int totalWidth = (maxRows * 2 - 1) * cellWidth;

        for (int row = 1; row <= maxRows; row++) {
            int numCount = row * 2 - 1;
            int lineLength = numCount * cellWidth;
            int padding = (totalWidth - lineLength) / 2;

            // Zentrierung
            for (int s = 0; s < padding; s++) {
                System.out.print(" ");
            }

            // Aufsteigender Teil
            int temp = 1;
            for (int j = 0; j < row; j++) {
                System.out.printf("%" + cellWidth + "d", temp);
                temp *= base;
            }

            // Rückwärts: temp ist nach der letzten Schleife 1x zu viel
            temp /= base;

            // Absteigender Teil
            for (int j = 1; j < row; j++) {
                temp /= base;
                System.out.printf("%" + cellWidth + "d", temp);
            }

            System.out.println();
        }
    }

    /**
     * 5.20
     */
    public void displayPrimeNumbers() {
        int space = 0;
        for(int number = 2; number <= 1200; number++) {
            for(int i = 2; i <= number; i++) {
                if(number % i == 0 && number != i) {
                    break;
                }
                if(number == i) {
                    System.out.print(number + " ");
                    space++;
                }
            }
            if(space == 10) {
                System.out.println();
                space = 0;
            }
        } 
    }

    /**
     * 5.21
     */
    public void computeInterestRates() {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        int loanAmout = input.nextInt();
        System.out.print("Number of Years: ");
        int years = input.nextInt();

        System.out.printf("%-20s %-20s %-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        for(double interestRate = 5; interestRate <= 10; interestRate += 0.25) {
            double totalPayment = interestRate / 100 * loanAmout * years;
            double monthlyPayment = totalPayment / years / 12;
            System.out.printf("%.3f%-20%%-20.2f%.2f\n", interestRate, monthlyPayment, totalPayment);
        }
    }

    /**
     * 5.22
     */
    public void loanAmortization() {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        int loanAmout = input.nextInt();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        int annualInterestRate = input.nextInt();
        int monthlyInterestRate = annualInterestRate / 12;

        double totalPayment = annualInterestRate / 100 * loanAmout * years;
        double monthlyPayment = totalPayment / 12 / years;

        double balance = loanAmout;
        double monthlyInterest = monthlyInterestRate * balance;
        double principal = monthlyPayment - monthlyInterest;
        
        for (int i = 1; i <= years * 12; i++) {
            monthlyInterest = monthlyInterestRate * balance;
            principal = monthlyPayment - monthlyInterest;
            balance = balance - principal;
            System.out.println(i + "\t\t" + monthlyInterest
                + "\t\t" + principal + "\t\t" + balance);
        }
    }

    /**
     * 5.23
     */
    public void cancellationErrors() {
        float sumL = 0; 
        for(int i = 1; i <= 50000; i++) {
            sumL = sumL + 1.0f / i;
        }

        float sumR = 0;
        for(int i = 50000; i >= 1; i--) {
            sumR = sumR + 1.0f / i;
        }
        System.out.println(sumL);
        System.out.println(sumR);
    }

    /**
     * 5.24
     */
    public void sumASeries() {
        float sum = 0;
        float nenner = 3.0f;
        for(int zaehler = 1; zaehler <= 97; zaehler += 2) {
            sum += zaehler / nenner;
            nenner += 2;
        }

        System.out.println(sum);
    }

    /**
     * 5.25
     */
    public void computePI() {
        // for(int i = )
    }

    /**
     * 5.26
     */
    public void computeE() {
        double e = 1;
        for(int i = 1; i <= 10000; i++) {
            double n = 1;
            while(i >= 1) {
                n *= i;
                i--;
            }
            e += (1 / n);
        }
        System.out.println(e);
    }

    /**
     * 5.27
     */
    public void leapYear() {
        int counter = 0;
        int numberOfLeapYears = 0;
        for(int year = 2014; year <= 2114; year++) {
            if(year % 4 == 0) {
                System.out.print(year + " ");
                counter++;
                numberOfLeapYears++;

                if(counter == 10) {
                    System.out.println();
                    counter = 0;
                }
            }
        }
        System.out.println("The number of leap years is " + numberOfLeapYears);
    }

    /**
     * 5.28
     */
    public void displayFirstDaysOfEachMonth() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year: ");
        int day = input.nextInt();

        int lastDay = 31;
        for(int month = 1; month <= 12; month++) {
            if(month == 2) lastDay = 28;
            
            String StringMonth = "";
            switch(month) {
                case 1: StringMonth = "January"; break;
                case 2: StringMonth = "Febrary"; break;
                case 3: StringMonth = "March"; break;
                case 4: StringMonth = "April"; break;
                case 5: StringMonth = "May"; break;
                case 6: StringMonth = "June"; break;
                case 7: StringMonth = "Juli"; break;
                case 8: StringMonth = "August"; break;
                case 9: StringMonth = "September"; break;
                case 10: StringMonth = "October"; break;
                case 11: StringMonth = "November"; break;
                case 12: StringMonth = "December"; break;
            }
            
            String StringDay = "";
            switch(day) {
                case 1: StringDay = "Monday"; break;
                case 2: StringDay = "Tuesday"; break;
                case 3: StringDay = "Wednesday"; break;
                case 4: StringDay = "Thursday"; break;
                case 5: StringDay = "Friday"; break;
                case 6: StringDay = "Saturday"; break;
                case 7: StringDay = "Sunday"; break;
            }
            
            System.out.printf("%s 1, %d is %s\n", StringMonth, year, StringDay);
            
            for(int days = 1; days <= lastDay; days++) {
                if(day >= 7) day = 0;
                day++;
            }

            if(lastDay == 31) {
                lastDay = 30;
            } else {
                lastDay = 31;
            }
        }
    }

    public void displayCalendars() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year: ");
        int day = input.nextInt();

        int lastDay = 31;
        for(int month = 1; month <= 12; month++) {
            if(month == 2) lastDay = 28;
            
            String stringMonth = "";
            switch(month) {
                case 1: stringMonth = "January"; break;
                case 2: stringMonth = "Febrary"; break;
                case 3: stringMonth = "March"; break;
                case 4: stringMonth = "April"; break;
                case 5: stringMonth = "May"; break;
                case 6: stringMonth = "June"; break;
                case 7: stringMonth = "Juli"; break;
                case 8: stringMonth = "August"; break;
                case 9: stringMonth = "September"; break;
                case 10: stringMonth = "October"; break;
                case 11: stringMonth = "November"; break;
                case 12: stringMonth = "December"; break;
            }
            
            String stringDay = "";
            switch(day) {
                case 1: stringDay = "Monday"; break;
                case 2: stringDay = "Tuesday"; break;
                case 3: stringDay = "Wednesday"; break;
                case 4: stringDay = "Thursday"; break;
                case 5: stringDay = "Friday"; break;
                case 6: stringDay = "Saturday"; break;
                case 7: stringDay = "Sunday"; break;
            }

            System.out.printf("%20s %d\n", stringMonth, year);
            System.out.println("---------------------------------------");
            System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s%-6s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
            
            int space = 3;
            for(int i = 1; i < day; i++ ) {
                space += 6;
            }
            
            for(int days = 1; days <= lastDay; days++) {
                System.out.printf("%" + space +"d", days);
                if(day >= 7){
                    System.out.println();
                    day = 0;
                    space = 3;
                } else {
                    space = 6;   
                }    
                day++;
            }

            System.out.println();

            if(lastDay == 31) {
                lastDay = 30;
            } else {
                lastDay = 31;
            }
        }
    }

    /**
     * 5.30
     */
    public void compoundValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the annual interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter the savings amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the number of months: ");
        int months = input.nextInt();

        double finalAmount = 0;
        double monthlyInterest = interestRate / 100 / 12;
        for(int i = 1; i <= months; i++) {
            finalAmount = (finalAmount + amount) * (1 + monthlyInterest);
            System.out.printf("Savings for month %d: %.3f\n", i, finalAmount);
        }
    }

    /**
     * 5.31
     */
    public void computeCDValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double percentageYield = input.nextDouble();
        System.out.print("Enter the number of months: ");
        int months = input.nextInt();

        System.out.printf("%-10s %s\n", "Month", "CD Value");
        for(int i = 1; i <= months; i++) {
            amount = amount + amount * percentageYield / 1200;
            System.out.printf("%-10d %.2f\n", i, amount);
        }
    }

    /**
     * 5.33
     */
    public void perfectNumber() {
        int divisorSum = 0;
        for(int i = 1; i < 10000; i++) {
            for(int j = i; j >= 1; j--) {
                // same number excluded
                if(j == i) continue;

                // if divisor then sum
                if(i % j == 0) {
                    divisorSum += j;
                }
            }
            //if sum of divisors = number then display
            if(divisorSum == i) {
                System.out.println("Perfect number: " + i);
            }
            //reset divisor sum in all cases
            divisorSum = 0;
        }
    }

    /**
     * 5.35
     */
    public void summation() {
        double sum = 0;
        for(int i = 1; i <= 1000; i++) {
            sum += 1 / (Math.sqrt(i) + Math.sqrt(++i));
        }
        System.out.println(sum);
    }

    /**
     * 5.37
     */
    public void decimalToBinary() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int number = input.nextInt();
        String binary = "";

        while(number > 0) {
            binary += number % 2;
            number /= 2;
        }

        System.out.println(binary);
    }

    /**
     * 5.38
     */
    public void decimalToOctal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int number = input.nextInt();
        String binary = "";

        while(number > 0) {
            binary = number % 8 + binary;
            number /= 8;
        }

        System.out.println(binary);
    }

    /**
     * 5.40
     */
    public void headsOrTails() {
        int numHeads = 0;
        int numTails = 0;
        for(int i = 0; i < 1000000; i++) {
            if(Math.random() > 0.5) {
                numHeads++;
            } else {
                numTails++;
            }
        }
        System.out.println("Number of heads: " + numHeads);
        System.out.println("Number of tails: " + numTails);
    }
}
    
