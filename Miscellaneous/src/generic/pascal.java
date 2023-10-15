/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author nazal
 */
public class pascal {
    int factorial(int n){
        int result=1;
        while(n>=1){
            result = result*n;
            n=n-1;
        }
        return result;
    }
    
    int ncr(int a,int b){
        int x = factorial(a);
        int y = factorial(b);
        int z = factorial((a-b));
        
        return x/(y*z);
    }
    
    void print(int n){
        int i=0,r;
        
        while(i<=n-1){
            r=0;
            
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            
            while(r<=i){
                System.out.print(ncr(i, r) + " ");
                r++;
            }
            System.out.println("");
            i++;
        }
    }
    
    public static void main(String args[]){
        pascal p = new pascal();
        p.print(5);
    }
}
