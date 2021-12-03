package ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int customerNumber = 0;
    private int pinNumber;
    private double checkingBalance = 0 ;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");

//   Set Customer Number

    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }
//  Get Customer Number
    public int getCustomerNumber(){
        return customerNumber;
    }

//   Get and Set PinNumber
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getPinNumber(){
        return pinNumber;
    }

//    Get Checking Account Balance

    public double getCheckingBalance(){
        return checkingBalance;
    }

    //    Get Saving Account Balance

    public double getSavingBalance(){
        return savingBalance;
    }

//    Calculate Checking Account Withdrawal

    public double calcCheckingWithdrawal(double amount){
        checkingBalance = checkingBalance - amount;
        return checkingBalance;
    }

//    Calculate Saving Account Deposit

    public double calcSavingDeposit(double amount){
        savingBalance = savingBalance + amount;
        return savingBalance;
    }

//    Calculate Checking Account Deposit

    public double calcCheckingDeposit(double amount){
        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }

//    Calculate Saving Account Withdrawal

    public double calcSavingWithdrawal(double amount){
        savingBalance = savingBalance - amount;
        return savingBalance;
    }

//  Customer Checking Account Withdraw Amount

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you would like to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance - amount) > 0){
            calcCheckingWithdrawal(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance Can't be negative");
        }
    }
//  Customer Saving Account Withdraw Amount

    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you would like to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance - amount) > 0){
            calcSavingWithdrawal(amount);
            System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance Can't be negative");
        }
    }

//    Customer Checking Account Deposit

    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you would like to deposit to Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance + amount) > 0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance Can't be negative");
        }
    }

//    Customer Saving Account Deposit

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you would like deposit to Saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance + amount) > 0){
            calcSavingDeposit(amount);
            System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance Can't be negative");
        }
    }

}
