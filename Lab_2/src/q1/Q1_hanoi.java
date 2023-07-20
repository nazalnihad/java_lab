/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;
import java.util.Scanner;
/**
 *
 * @author nazal
 */
public class Q1_hanoi {
    static void hanoi(String start, String end, String middle, int n){
        if(n==0){
            return;
        }
        hanoi(start,middle,end,n-1);
        System.out.print("Move disk " + n + " from " + start + " to " +end +"\n");
        hanoi(middle,end,start,n-1);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of disks : ");
        int n = sc.nextInt();
        hanoi("A","C","B",n);
        
    }
}
