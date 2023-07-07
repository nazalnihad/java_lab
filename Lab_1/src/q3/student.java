/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3;
import java.util.Scanner;


/**
 *
 * @author nazal
 */
public class student {
    
    String name;
    int rollNo,total=0;
    int[] marks;
    static int greatTotal;
    
    public void initialise(String name,int roll_no,int[] marks){
        this.name = name;
        this.rollNo = roll_no;
        this.marks = marks;
    }
    
    public void getTotal(){
        for(int i=0;i<5;i++){
            this.total+=marks[i];
        }
        greatTotal+=total;
    }
    
    public int setTotal(){
        return total;
    }
    
    public void printDetail(){
        System.out.println("\nName : "+name);
        System.out.println("Roll number : " + rollNo);
        System.out.println("==MARKS==");
        for(int i=0;i<5;i++){
            System.out.print("Subject "+i+1+" marks : ");
            System.out.print(marks[i]+"\n");
        }
        System.out.println("Total marks : "+total);
        
    }

}
