/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q9;

/**
 *
 * @author nazal
 */
//By inheriting the Employee class and Salary Interface create a
//new class SalarySlip which override the salary calculation method to calculate the net salary
//of an employee from basic pay. Provide a function to print the Salary Slip of the employee in
//SalarySlip class.
public class SalarySlip extends Employee implements Salary{
    double bonus,allowance,net_salary;
    
    @Override
    public void CalcSalary(){
        bonus = (10.0/100)*basic_pay;
        allowance = 5000;
        net_salary = basic_pay + bonus + allowance;
    }
    void slip(){
        System.out.println("\n====== SALARY SLIP =====");
        System.out.println("Employee Name : "+name);
        System.out.println("Employee coide : "+code);
        System.out.println("Basic Pay : "+basic_pay);
        System.out.println("Bonus : "+bonus);
        System.out.println("Allowance "+allowance);
        System.out.println("Net Salary : "+net_salary);
        System.out.println("========================");
        
    }
}
