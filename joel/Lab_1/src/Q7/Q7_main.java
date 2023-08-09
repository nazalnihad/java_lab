/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q7;
import java.util.Scanner;
/**
 *
 * @author nazal
 */
public class Q7_main {
    
    @SuppressWarnings("null")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice,balanceAmount;
        
        System.out.print("Enter Account Holder Name: ");
        String account_name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int account_number = sc.nextInt();
        do{
        System.out.print("Enter Initial Balance Amount: ");
        balanceAmount = sc.nextInt();
        if(balanceAmount<1000){
            System.out.println("Min balance must be 1000");
        }
        }while(balanceAmount<1000);

//        decclare parent class to avoid separate conditions for savings and current
        Account account = null;
        do{
        System.out.println("1 - for savings account \n2 - for current account");
         choice = sc.nextInt();
        
//          initialise parent class according to choice
            switch (choice) {
                case 1 -> {
                    account = new SavingsAccount(account_name,account_number,balanceAmount);
                }
                case 2 -> {
                    account = new CurrentAccount(account_name,account_number,balanceAmount);
                }
                default -> System.out.println("invalid choice ");
            }
        }while(choice<0 || choice>2);
        
//       menu

        boolean start = true;
        while(start){
            System.out.println("\nMenu:");
            System.out.println("1 - Deposit money ");
            System.out.println("2 - Withdraw money ");
            System.out.println("3 - Display acccount details ");
            System.out.println("4 - exit");
            int option = sc.nextInt();
            
            switch(option){
                case 1 -> {
                    account.deposit();
                    break;
                }
                case 2 ->{
                    account.withdraw();
                    break;
                }
                case 3 ->{
                    account.display();
                    break;
                }
                case 4 ->{
                    start = false;
                }
                default ->{
                    System.out.println("Enter a valid choice ");
                }
                    
            }
        }
    }
    
}
