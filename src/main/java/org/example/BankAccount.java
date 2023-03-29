package org.example;

public class BankAccount {

//    Properties


    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String accountNumber;
    private Integer balance;


//    Constructors

    public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth, String inputAccountNumber){

        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;


    }



//    Methods

    public int deposit(int amountIn){

        return amountIn + this.balance;

    }

    public int withdrawal(int amountOut){
        return this.balance - amountOut;
    }

    public double Interest(){
        return this.balance * 1.05;
    }



//    Getters

    public String getName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public int getBalance(){
        return this.balance;
    }



//    Setters

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;

    }

    public void setLastName(String newLastName){

        this.lastName = newLastName;
    }

    public void setDateOfBirth(String newDateOfBirth){

        this.dateOfBirth = newDateOfBirth;
    }

    public void setAccountNumber(String newAccountNumber){

        this.accountNumber = newAccountNumber;
    }

    public void setBalance(int newBalance){

        this.balance = newBalance;
    }













}
