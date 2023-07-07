/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Q6;

/**
 *
 * @author nazal
 */
public class Q6 {
    public static void main(String[] args){
        rectangle rect = new rectangle();
        box test = new box(5);
        
        
        rect.setValues(5,10);
        rect.calcArea();
        double rect_area = rect.getArea();
        System.out.println("The area of the rectangle is : "+rect_area);
        
        test.setValues(10, 20);
        test.calcVol();
        double box_vol = test.getVol();
        System.out.println("The volume of the box is : "+box_vol);
    }
    
}
