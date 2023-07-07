/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;
/**
 *
 * @author nazal
 */
public class complexOperations {
    
    public static void add(complex a,complex b){
        complex total = new complex();
        total.real = a.get_real()+b.get_real();
        total.imaginary = a.get_imag()+b.get_imag();
        
        System.out.print("The addition of the complex numbers are : ");
        total.print();
    }
    
    public static void multiply(complex a, complex b){
        complex mult = new complex();
        mult.real = a.get_real()*b.get_real() - a.get_imag()*b.get_imag();
        mult.imaginary = a.get_real()*b.get_imag() + a.get_imag()*b.get_real();
        System.out.print("The multiplication of the complex numbers are : ");
        mult.print();
    }
    
    public static void modulus(complex a){
        double moduli = Math.sqrt(a.get_real()*a.get_real()+a.get_imag()*a.get_imag());
        System.out.println("The modulus of the complex number is : "+moduli);
    }
}
