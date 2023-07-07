/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Write a program to create a class called Rectangle with members length, breadth and area.
//Provide functions to find area and get back the area. Create a new class Box by extending
//Rectangle class add two new members, height and volume and also new functions to
//calculate and get back the volume.
package Q6;

/**
 *
 * @author nazal
 */
public class box extends rectangle{
    double height,volume;
    
    public box(double height){
        this.height = height;
    }
    void calcVol(){
        this.volume = length*breadth*height;
    }
    double getVol(){
        return volume;
    }
    
}
