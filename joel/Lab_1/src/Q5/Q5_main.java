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
import java.util.Scanner;

/**
 *
 * @author nazal
 */
public class Q5_main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the side length for the cube: ");
        double cube_length = sc.nextDouble();
        Box cube = new Box(cube_length);

        System.out.print("\nEnter the length for the square prism: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width for the square prism: ");
        double width = sc.nextDouble();
        Box squarePrism = new Box(length, width);

        System.out.print("\nEnter the length for the cuboid: ");
        double cuboid_length = sc.nextDouble();
        System.out.print("Enter the width for the cuboid: ");
        double cuboid_width = sc.nextDouble();
        System.out.print("Enter the height for the cuboid: ");
        double cuboid_height = sc.nextDouble();
        Box cuboid = new Box(cuboid_length, cuboid_width, cuboid_height);
        
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
