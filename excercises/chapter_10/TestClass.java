package excercises.chapter_10;

import java.util.Scanner;

import excercises.chapter_09.Account;

public class TestClass {
    public static void main(String[] args) {
        circle2DTest();
    }

    public static void timeTest() {
        Time t1 = new Time();
        Time t2 = new Time(1231700000);
        Time t3 = new Time(23, 59, 40);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
    }

    public static void myIntegerTest() {
        MyInteger m1 = new MyInteger(17);
        System.out.println(m1.isOdd());
    }

    public static void ATMMachine() {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];

        for(int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        while(true) {
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            if(id > accounts.length - 1 || id < 0) {
                System.out.println("No account with id " + id + " found");
                continue;
            }

            Account currentAccount = accounts[id];

            boolean exit = false;
            while(!exit) {
                System.out.println();
                System.out.printf("Main menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");
                int choice = input.nextInt();
        
                if(choice < 1 || choice > 4) {
                    System.out.println("No such choice available");
                    continue;
                }
        
                switch(choice) {
                    case 1: System.out.println("The balance is " + currentAccount.getBalance());
                            break;
                    case 2: System.out.print("Enter an amount to withdraw: ");
                            int withdrawalAmount = input.nextInt();
                            currentAccount.withdraw(withdrawalAmount);
                            break;
                    case 3: System.out.print("Enter an amount to deposit: ");
                            int depositAmount = input.nextInt();
                            currentAccount.withdraw(depositAmount);
                            break;
                    case 4: exit = true;
                }
            }
        }  
    } 

    public static void taxTest() {
        for(int filingStatus = 0; filingStatus < 4; filingStatus++) {
            int income = 50000;
            System.out.print("Filing status " + filingStatus + ": ");
            for(int interval = 0; interval < 10; interval++) {
                Tax tax = new Tax(filingStatus, income);
                System.out.printf("%-10.2f ", tax.getTax());
                income += 1000;
            }
            System.out.println();
        }
    }

    public static void queueTest() {
        Queue q = new Queue();
        for(int i = 0; i <= 20; i++) {
            q.enqueue(i);
            System.out.println(q.getElements()[i]);
        }

        for(int i = 0; i <= 20; i++) {
            System.out.println(q.dequeue());
        }

        System.out.println(q.empty());

    }

    public static void circle2DTest() {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
