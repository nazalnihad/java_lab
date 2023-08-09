/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q8;

/**
 *
 * @author nazal
 */
public class Q8_main {
    public static void main(String[] args){
        Sphere sphere = new Sphere();
        Cylinder cylinder = new Cylinder();
        
        System.out.println("==== Sphere ====");
        sphere.getDimensions();
        sphere.printArea();
        sphere.printVolume();
        
        System.out.println("\n==== Cylinder ====");
        cylinder.getDimensions();
        cylinder.printArea();
        cylinder.printVolume();
    }
}
