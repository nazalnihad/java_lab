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
//Write a program to create a class Employee with data members name, code and basic pay
//and with functions to initialize and print information. Create an interface Salary with a
//function salary calculation. By inheriting the Employee class and Salary Interface create a
//new class SalarySlip which override the salary calculation method to calculate the net salary
//of an employee from basic pay. Provide a function to print the Salary Slip of the employee in
//SalarySlip class.

public class Q9_main {
public static void main(String[] args) {
        SalarySlip salary = new SalarySlip();
        Scanner sc = new Scanner(System.in);
        int choice;
        salary.initialise();
        do{
            System.out.println("\n1 - Employee Details");
            System.out.println("2 - Print Salary Slip");
            System.out.println("3 - Exit");
            System.out.print(" : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> salary.display();
                case 2 -> {
                    salary.CalcSalary();
                    salary.slip();
                }
                case 3 -> System.out.println("Exiting..");
                default -> System.out.println("Invalid choice ");
            }
        } while (choice != 3);
    }
    
}
