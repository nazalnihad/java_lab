/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q8;

import java.util.Scanner;

/**
 *
 * @author nazal
 */
public class customEx_Main {
    
    static void checkAge(int age) throws customException{
            if(age>=12 && age<=55){
                System.out.println("You shall enter the ride");
            }else{
                throw new customException("must be of age between 12 and 55");
            }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        
        try{
            checkAge(age);
        }
        catch(Exception e){
            System.out.println("Age exception caught "+e);
        }
    }
    
    
}
