/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author nazal
 */
public class Complex {
    int real,imaginary;
    
    void initialise(int real,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    
    int get_real(){
        return real;
    }
    
    int get_imag(){
        return imaginary;
    }
    
    void print(){
        if(imaginary<0){
            System.out.println(real +""+imaginary+"i");
        }
        else{
            System.out.println(real +"+"+imaginary+"i");
        }
    }
}
