package com.company;

public class BankAccount {

    double amount = 0.0;
    double withdrawal;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount = amount + sum;
    }

    public void withDraw(int sum) throws LimitException {
        withdrawal =sum;
        if (amount < sum) {
            throw new LimitException("Недостаточно средств",amount);
        }
        amount -= sum;
    }



}
