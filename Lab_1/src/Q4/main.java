/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author nazal
 */
public class main {
    
    public static void main(String[] args){
//        creating objects
    complex object1 = new complex();
    complex object2 = new complex();
    
//    initialise values
    object1.initialise(3,-2);
    object2.initialise(4,5);
    
    System.out.println("\nThe complex numbers entered are ");
    object1.print();
    object2.print();
    
//    operations
    complexOperations test = new complexOperations();
    System.out.println("\nThe operations done are");
    test.add(object1,object2);
    test.multiply(object1,object2);
    
    System.out.println("\nTheir modulus are ");
    test.modulus(object1);
    test.modulus(object2);
    }
}
