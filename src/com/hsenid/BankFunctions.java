package com.hsenid;

import java.util.Scanner;

public class BankFunctions implements IBankFunctions{

    Scanner input =  new Scanner(System.in);

    void begin(){
        BankAccount a = new BankAccount();

        System.out.println("Hi Banker, What is your name?");
        a.setUsername(input.nextLine());

        System.out.println("Okay " + a.getUsername()+ ", What is your Account No");
        a.setAccountNo(input.nextInt());

        System.out.println(a.getUsername()+ ", What is your Account type?");
        a.setAccountType(input.next());

        System.out.println(a.getUsername()+ ", Initial Balance Please?");
        a.setBalance(input.nextInt());

        menu();
    }


    @Override
    public void menu() {
        System.out.println("========Menu========");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Display Details");
        System.out.println("5. Exit");
        System.out.println("========Menu========");
    }

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public void checkBalance() {

    }

    @Override
    public void displayDetails() {

    }
}
