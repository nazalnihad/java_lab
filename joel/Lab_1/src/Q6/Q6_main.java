/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Q6;

import java.util.Scanner;

/**
 *
 * @author nazal
 */
public class Q6_main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        
//        Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        rect.setValues(length,width);
        rect.calcArea();
        double rect_area = rect.getArea();
        System.out.println("The area of the rectangle is : "+rect_area);       
    
//        Cube
        System.out.print("\nEnter the length of the cube : ");
        double cube_length = sc.nextDouble();
        
        System.out.print("Enter the width of the cube : ");
        double cube_width = sc.nextDouble();
        
        System.out.print("Enter the height of the cube : ");
        double height = sc.nextDouble();
        
        Box cube = new Box(height);        
        cube.setValues(cube_length , cube_width);
        
        cube.calcVol();
        double box_vol = cube.getVol();
        System.out.println("The volume of the box is : "+box_vol);
    }
    
}
