package excercises.chapter_11;

import java.util.Date;
import java.util.ArrayList;

public class Account {
    private String name;
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();
    private ArrayList<Transaction> transactions;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        transactions = new ArrayList<>();
    }

    public Account(String name, int id, double balance) {
        this(id, balance);
        this.name = name;
    }

    public void withdraw(double withdrawalAmount) {
        transactions.add(new Transaction('W', withdrawalAmount, balance, "Withdrawal"));
        balance -= withdrawalAmount;

    }

    public void deposit(double depositAmount) {
        transactions.add(new Transaction('D', depositAmount, balance, "Deposit"));
        balance += depositAmount;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("The balance is %f while the monthly interest is %f. Date is %tF", getBalance(), getMonthlyInterest(), getDateCreated());
    }
}

