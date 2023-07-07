/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//
//Write a program to create a class Box with data members length, breadth, height, area and
//volume. Provide 3 constructors having one parameter (for cube), two parameters (for
//square prism) three parameters (rectangular prism). Also provide functions to calculate area
//and volume. 
package Q5;

/**
 *
 * @author nazal
 */
public class Q5 {
    public static void main(String[] args){
        box cube = new box(5);
        box squarePrism = new box(5,10);
        box cuboid = new box(5,10,20);
        
        System.out.println("\n=== Cube ===");
        cube.calcArea();
        cube.calcVolume();
        cube.display();
        
        System.out.println("\n=== square prism ===");
        squarePrism.calcArea();
        squarePrism.calcVolume();
        squarePrism.display();
        
        System.out.println("\n=== Cuboid ===");
        cuboid.calcArea();
        cuboid.calcVolume();
        cuboid.display();
    }
    
}
