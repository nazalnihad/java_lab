/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author nazal
 */
public class Q2 {
    
    public static void stringRepeat(String name,int n){
        for(int i=0;i<n;i++){
            System.out.println(name);
        }
    }
    
    public static void main(String[] args){
        if(args.length>1){
        String name = args[0];
        int n = Integer.parseInt(args[1]);
        stringRepeat(name,n);
        }
        else{
            System.out.println("proper input of string and number must be given in order ");
        }
    }
}
