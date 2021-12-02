package ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

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

    public int getCheckingBalance(){
        return checkingBalance;
    }

    //    Get Saving Account Balance

    public int getSavingBalance(){
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

//  Customer CHecking Account Withdraw Amount

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you would like to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance - input) > 0){
            calcCheckingWithdrawal(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance Can't be nagative");
        }
    }



}
