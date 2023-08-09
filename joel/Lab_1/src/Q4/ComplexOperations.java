/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;
/**
 *
 * @author nazal
 */
public class ComplexOperations {
    
    public static void add(Complex a,Complex b){
        Complex total = new Complex();
        total.real = a.get_real()+b.get_real();
        total.imaginary = a.get_imag()+b.get_imag();
        
        System.out.print("The addition of the complex numbers are : ");
        total.print();
    }
    
    public static void multiply(Complex a, Complex b){
        Complex mult = new Complex();
        mult.real = a.get_real()*b.get_real() - a.get_imag()*b.get_imag();
        mult.imaginary = a.get_real()*b.get_imag() + a.get_imag()*b.get_real();
        System.out.print("The multiplication of the complex numbers are : ");
        mult.print();
    }
    
    public static void modulus(Complex a){
        double moduli = Math.sqrt(a.get_real()*a.get_real()+a.get_imag()*a.get_imag());
        System.out.println("The modulus of the complex number is : "+moduli);
    }
}
