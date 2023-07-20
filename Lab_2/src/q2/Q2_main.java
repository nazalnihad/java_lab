/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2;

/**
 *
 * @author nazal
 */
public class Q2_main {
    public static void main(String[] args){
        DynamicArray obj = new DynamicArray(5);
        obj.getArray();
        obj.printArray();
        obj.addElement(2);
        obj.printArray();
        obj.addElement(2,4);
        obj.printArray();
        obj.removeElement(3);
        obj.printArray();
        int x = obj.searchElement(4);
        System.out.println(x);
    }
}
