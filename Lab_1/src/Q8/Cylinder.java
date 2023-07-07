/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q8;
/**
 *
 * @author nazal
 */
public class Cylinder implements Three_D_shapes{
    
    double radius,height,area,volume;
    
    @Override
    public void getDimensions(){
        System.out.print("Enter the radius of the cylinder : ");
        radius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder : ");
        height = sc.nextDouble();
    }
    
    @Override
    public void printArea(){
        area = 2*3.14*radius*(height+radius);
        System.out.println("\nThe area of the cylinder is : "+area);
    }
    
    @Override
    public void printVolume(){
        volume = 3.14*radius*radius*height;
        System.out.println("The volume of the cylinder is : "+volume);
    }
    
}
