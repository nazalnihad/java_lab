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
public class Q3_main {
    
    public static void main(String[] args) {
    Student[] s = new Student[2];
    
    Scanner sc = new Scanner(System.in);
    
    String name;
    int roll_no;

    for(int i=0;i<2;i++){
        System.out.print("\nEnter the name of the student "+(i+1) +" : ");
        name = sc.nextLine();
        System.out.print("Enter the roll no of the student "+(i+1)+" : ");
        roll_no = sc.nextInt();
        
        int[] marks = new int[5];
        for(int j=0;j<5;j++){
            System.out.print("Enter marks in subject "+(j+1)+" : ");
            marks[j] = sc.nextInt();
        }
        
        sc.nextLine();
        s[i] = new Student();
        s[i].initialise(name,roll_no,marks);
    }
    
    for(int i=0;i<2;i++){
        s[i].getTotal();
        int s_total = s[i].setTotal();
        s[i].printDetail();
        System.out.println(s_total);
    }
    
    System.out.println("\nTotal of both students are "+s[1].greatTotal);
}
    
}
