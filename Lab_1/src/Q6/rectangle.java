/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

/**
 *
 * @author nazal
 */
//Write a program to create a class called Rectangle with members length, breadth and area.
//Provide functions to find area and get back the area. Create a new class Box by extending
//Rectangle class add two new members, height and volume and also new functions to
//calculate and get back the volume.
public class rectangle {
    
    public double length,breadth,area;
    
   void setValues(double length,double breadth){
       this.length = length;
       this.breadth = breadth;
   }
    void calcArea(){
        this.area = length*breadth;
    }
    double getArea(){
        return area;
    }
    
}
