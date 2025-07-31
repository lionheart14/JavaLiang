package excercises.chapter_09;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account() {
        
    }

    public void withdraw(double withdrawalAmount) {
        balance -= withdrawalAmount;
    }

    public void deposit(double depositAmount) {
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

    @Override
    public String toString() {
        return String.format("The balance is %f while the monthly interest is %f. Date is %tF", getBalance(), getMonthlyInterest(), getDateCreated())
    }
}
