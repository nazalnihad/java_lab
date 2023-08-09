/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Write a program to create a class Box with data members length, breadth, height, area and
//volume. Provide 3 constructors having one parameter (for cube), two parameters (for
//square prism) three parameters (rectangular prism). Also provide functions to calculate area
//and volume. 
package Q5;

/**
 *
 * @author nazal
 */
public class Box {
    double length,width,height;
    double area,volume;
    
    public Box(double length){
        this.length = length;
        this.width = length;
        this.height = length;
    }
    public Box(double length,double height){
        this.length = length;
        this.height = height;
        this.width = length;
    }
    
    public Box(double length,double width,double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    void calcArea(){
        if(length==width && width==height){
            this.area = 4*length; 
        }
        else if(length == width){
            this.area = 2*length*length + 4*height*length;
        }
        else{
            this.area = 2*(length*height+width*height+length*width);
        }
    }
    
    void calcVolume(){
            this.volume = length*width*height;
    }
    
    double getArea(){
        return area;
    } 
    
    double getVolume(){
        return volume;
    }
    void display(){
        System.out.println("The area of the shape is : "+getArea());
        System.out.println("The volume of the shape is : "+getVolume());
    }
    
}
