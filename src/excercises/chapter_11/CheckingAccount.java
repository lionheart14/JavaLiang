package excercises.chapter_11;

import excercises.chapter_09.Account;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double withdrawalAmount) {
        if(Math.abs(balance - withdrawalAmount) > overdraftLimit) {
            System.out.println("Overdraft Limit exceeded");
            return;
        }
        super.withdraw(withdrawalAmount);
    }

    @Override
    public String toString() {
        return "Account Type: Checking Account" + super.toString();
    }
}
