package com.company;

public class BankAccount {

    double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount = amount + sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {                                             //создаем и предупреждаем о возможном исключении
            throw new LimitException("Недостаточно средств",amount);        //которое может возникнуть при недостатке на счете суммы
        }
        amount -= sum;
    }



}
