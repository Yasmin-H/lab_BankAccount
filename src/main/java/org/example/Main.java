package org.example;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Yasmin", "Haidar", "03/03/2001", "23455");


        account1.setBalance(200);
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
        System.out.println(account1.deposit(100));
        System.out.println(account1.withdrawal(50));
        System.out.println(account1.Interest());



    }
}