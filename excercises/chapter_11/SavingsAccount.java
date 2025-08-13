package excercises.chapter_11;

import excercises.chapter_09.Account;

public class SavingsAccount extends Account {
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double withdrawalAmount) {
        if(balance - withdrawalAmount < 0) {
            System.out.println("Savings account cannot be overdrawn");
            return;
        }
        super.withdraw(withdrawalAmount);
    }

    @Override
    public String toString() {
        return "Account Type: Savings Account" + super.toString();
    }
}
