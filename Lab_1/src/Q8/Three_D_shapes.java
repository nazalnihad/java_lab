/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Q8;
import java.util.Scanner;

/**
 *
 * @author nazal
 */

//Write a program to create an interface, 3DShapes with methods printVolume() and
//printArea(), which prints the Volume and Area respectively. Create classes Cylinder and
//Sphere by implementing 3DShapes interface. Using these child classes calculate the print
//volume and area of a cylinder and sphere
public interface Three_D_shapes {
    Scanner sc = new Scanner(System.in);
    
    void printVolume();
    void printArea();
    void getDimensions();
}
