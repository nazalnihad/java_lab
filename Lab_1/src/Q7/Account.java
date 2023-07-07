/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Write a program to create an abstract base class Account with 3 members Account holdername
//, Account number and balance amount. Provide constructor to initialize data
//members, function to deposit cash to Account and an abstract function, withdrawal

//Create two child classes Saving Account and Current Account of Account class. Override
//abstract function withdrawal in child classes as per the criteria, for savings maintain a
//minimum balance 1000 and for current Account, one can withdraw 5% of current balance as
//overdraft amount. Illustrate the above as a menu driven program..
package Q7;
import java.util.Scanner;
/**
 *
 * @author nazal
 */
abstract class Account {
    protected String account_holder;
    protected int account_no,balance_amount;
    Scanner sc = new Scanner(System.in);
    
    public Account(String account_holder,int account_no,int balance_amount){
        this.account_holder = account_holder;
        this.account_no = account_no;
        this.balance_amount = balance_amount;
    }
    
    public void deposit(){
        int deposit_amount;
        System.out.print("Enter the amount you want to deposit : ");
        deposit_amount = sc.nextInt();
        if(deposit_amount<0){
            System.out.println("enter a valid amount ");
        }
        else{
            balance_amount+=deposit_amount;
            System.out.println("Amount deposited successfully ");
        }
//        return balance_amount;
    }
    abstract public void withdraw();
    public void display(){
        System.out.println("Account holder name : "+account_holder);
        System.out.println("Account number : "+account_no);
        System.out.println("Account balance :"+balance_amount);
    }
}


