/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//for current Account, one can withdraw 5% of current balance as
//overdraft amount. Illustrate the above as a menu driven program.
package Q7;

/**
 *
 * @author nazal
 */
public class CurrentAccount extends Account{
    
    double overdraftAmount;
    public CurrentAccount(String account_holder,int account_no,int balance_amount){
        super(account_holder,account_no,balance_amount);
    }
        @Override
        public void withdraw(){
        int withdraw;
        overdraftAmount = (5.0/100.0)*balance_amount;
        
        System.out.println("Enter the amount you want to withdraw ");
        withdraw = sc.nextInt();
        
        if(withdraw>overdraftAmount){
            System.out.println("Invalid amount ");
            System.out.println("max withdrawable amount is "+overdraftAmount);
        }
        else{
            balance_amount -= withdraw;
             System.out.println("Amount withdrawn ");
        }
    }
    
}
