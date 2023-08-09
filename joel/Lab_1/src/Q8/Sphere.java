/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q8;
/**
 *
 * @author nazal
 */
public class Sphere implements Three_D_shapes{
    double radius,area,volume;
    
    @Override
    public void getDimensions(){
        System.out.print("Enter the radius of the sphere : ");
        radius = sc.nextDouble();
    }
    
    @Override
    public void printArea(){
        area = 4*3.14*radius*radius;
        System.out.println("\nThe area of the sphere is : "+area);
    }
    
    @Override
    public void printVolume(){
        volume = (4/3)*3.14*radius*radius*radius;
        System.out.println("The volume of the sphere is : "+volume);
    }
    
    
}
