package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(10000);
        System.out.println(account.getAmount());

        while (true){
            try {
                account.withDraw(4000);// Пытаемся снять со счета деньги
                System.out.println("Вы сняли со счета " + account.getAmount() + " cом");
            } catch (LimitException e) {
                try {
                    System.out.println(e.getMessage());
                    account.withDraw(+ (int)account.getAmount() );                // Снимаем со счета то,что есть,
                    System.out.println("Вы сняли со счета " + account.getAmount() + " cом");
                } catch (LimitException e1) {                                      // если запрашиваемая сумма превышает сумму на счете
                }
                break;
            }
        }

    }
}
