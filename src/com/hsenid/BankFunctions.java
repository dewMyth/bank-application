package com.hsenid;

import java.util.Scanner;

public class BankFunctions implements IBankFunctions{

    Scanner input =  new Scanner(System.in);

    void begin(){
        BankAccount a = new BankAccount();

        System.out.println("Hi Banker, What is your name?");
        a.setUsername(input.nextLine());

        System.out.println(a.getUsername()+ " What is your Account No");
        a.setAccountNo(input.nextInt());

        System.out.println(a.getUsername()+ " What is your Account type?");
        a.setAccountType(input.nextLine());

        System.out.println(a.getUsername()+ " What is your Account type?");
        a.setBalance(input.nextInt());
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
}
