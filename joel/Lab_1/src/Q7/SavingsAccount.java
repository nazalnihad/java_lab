/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Create two child classes Saving Account and Current Account of Account class. Override
//abstract function withdrawal in child classes as per the criteria, for savings maintain a
//minimum balance 1000 and for current Account, one can withdraw 5% of current balance as
//overdraft amount. Illustrate the above as a menu driven program.

package Q7;

/**
 *
 * @author nazal
 */
public class SavingsAccount extends Account{
    public SavingsAccount(String account_holder,int account_no,int balance_amount){
        super(account_holder,account_no,balance_amount);
    }

    @Override
    public void withdraw() {
        int withdraw;
        System.out.print("Enter the amount you want to withdraw : ");
        withdraw = sc.nextInt();
        if(balance_amount-withdraw<1000){
            System.out.println("Insufficent amount in account");
            System.out.println("your balance is "+balance_amount);
        }
        else{
            balance_amount-=withdraw;
            System.out.println("Amount withdrawn ");
        }
    }
    
}