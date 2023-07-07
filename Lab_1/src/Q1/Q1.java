/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author nazal
 */
public class Q1 {
    
        public static void prime(int n){
        int key=0,j=2;
        boolean check;
        while(key!=n){
            check = true;
            for(int i=2;i<j;i++){
                if(j%i==0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.print(j + " ");
                key++;
            }
            j++;
            
        }
    }
    
    public static void main(String[] args){
    if (args.length >= 1) {
            int number = Integer.parseInt(args[0]);
            System.out.println("\nThe first " + args[0] + " prime numbers are ");
            prime(number);
        } else {
            System.out.println("no number provided");
        }
    
    }
}
