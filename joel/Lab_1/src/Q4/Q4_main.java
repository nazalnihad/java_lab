/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;
import java.util.Scanner;
/**
 *
 * @author nazal
 */
public class Q4_main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        creating objects
    Complex[] object = new Complex[2];
    
    
    for(int i=0;i<2;i++){
        object[i] = new Complex();
        int n1,n2;
        System.out.print("\nEnter real value of the complex number "+(i+1)+" : ");
        n1 = sc.nextInt();
        
        System.out.print("Enter imaginary value of the complex number "+(i+1)+" : ");
        n2 = sc.nextInt();
        
        object[i].initialise(n1, n2);
    }

    System.out.println("\nThe complex numbers entered are ");
    object[0].print();
    object[1].print();
    
//    operations
    ComplexOperations test = new ComplexOperations();
    System.out.println("\nThe operations done are");
    test.add(object[0],object[1]);
    test.multiply(object[0],object[1]);
    
    System.out.println("\nTheir modulus are ");
    test.modulus(object[0]);
    test.modulus(object[1]);
    }
}
