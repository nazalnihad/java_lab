/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q10;

/**
 *
 * @author nazal
 */
//Write a program to illustrate finalize() method. 
public class Q10_main {
    public static void main(String[] args){
        finalize obj = new finalize();
        obj = null;
        System.gc();
    }
}

class finalize{
    protected void finalize() throws Throwable{
    System.out.println("Finalise method called");
    }
}