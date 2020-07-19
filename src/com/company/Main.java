package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(10000);
        System.out.println(account.getAmount());

        while (true){
            try {
                account.withDraw(4000);
                System.out.println(account.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    account.withDraw((int)account.getAmount());
                } catch (LimitException e1) {
                }
                break;
            }
        }

    }
}
