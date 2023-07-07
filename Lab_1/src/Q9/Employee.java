/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q9;

import java.util.Scanner;

/**
 *
 * @author nazal
 */
//create a class Employee with data members name, code and basic pay
//and with functions to initialize and print information.
public class Employee {
    String name;
    int code;
    double basic_pay;
    Scanner sc = new Scanner(System.in);
    
    void initialise(){
        System.out.print("Enter employee name : ");
        this.name = sc.nextLine();
        
        System.out.print("Enter the code : ");
        this.code = sc.nextInt();
        
        System.out.print("Enter basic pay : ");
        this.basic_pay = sc.nextDouble();
    }
    
    void display(){
        System.out.println("\n==== Employee Details  ====");
        System.out.println("Employee Name : "+name);
        System.out.println("Employee coide : "+code);
        System.out.println("Basic Pay : "+basic_pay);
        System.out.println("============================");
    }
}
