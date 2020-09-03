package com.hsenid;

import java.util.Scanner;

public class BankFunctions implements IBankFunctions{

    Scanner input =  new Scanner(System.in);
    BankAccount a = new BankAccount();

    void begin(){

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


        int optionNo;

        System.out.println("Please Enter Your Choice...");
        optionNo = input.nextInt();

        boolean quit = false;

        do {
            switch (optionNo) {
                case 1 :
                    checkBalance();
                    break;
                case 2 :
                    deposit();
                    break;
                case 3 :
                    withdraw();
                    break;
                case 4:
                    displayDetails();
                    break;
                case 5 :
                    quit = true;
                    break;
            }
        } while(!quit);

        System.out.println("====================");


    }

    @Override
    public void deposit() {
        System.out.println("Enter the amount you are going to deposit...");
        int depositAmount = input.nextInt();

        if(depositAmount > 0) {
             a.setBalance(a.getBalance() + depositAmount);
            System.out.println("Deposit Successful !");
            System.out.println("Current Balance : " + a.getBalance());
        }else {
            System.out.println("Enter valid amount!");
        }
        menu();
    }

    @Override
    public void withdraw() {
        System.out.println("Enter the amount you are going to withdraw...");
        int withdrawAmount = input.nextInt();

        if( a.getBalance() < withdrawAmount) {
            System.out.println("Insufficient Balance, Try a amount below = " + a.getBalance());
        }else {
            a.setBalance(a.getBalance() - withdrawAmount);
            System.out.println("Withdraw Successful !");
            System.out.println("Current Balance : " + a.getBalance());
        }
        menu();
    }

    @Override
    public void checkBalance() {
        System.out.println("Checking Balance......");
        System.out.println("=======================");
        System.out.println("Your Current Balance is : " + a.getBalance());
        System.out.println("=======================");
        menu();
    }

    @Override
    public void displayDetails() {
        System.out.println("Displaying......");
        System.out.println("============Your Details==============");
        System.out.println("Your name is : " + a.getUsername());
        System.out.println("Your Account type : " + a.getAccountType());
        System.out.println("Your Account No : " + a.getAccountNo());
        System.out.println("Your Current Balance is : " + a.getBalance());
        System.out.println("======================================");
        menu();
    }
}
