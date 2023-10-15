/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nazal
 */
public class ReadWrite {
    
    public void write(int n) throws IOException{
        int number = n;
        BufferedWriter odd = new BufferedWriter(new FileWriter("odd.txt"));
        BufferedWriter even = new BufferedWriter(new FileWriter("even.txt"));
        
        while(n>0){
            if(n%2==0){
                even.write("\n "+n);
            }
            else{
                odd.write("\n "+n);
            }
            n--;
        }
        odd.close();
        even.close();
    }
    
    public void read() throws FileNotFoundException, IOException{
        String even,odd;
        
        BufferedReader Even = new BufferedReader(new FileReader("even.txt"));
        BufferedReader Odd = new BufferedReader(new FileReader("odd.txt"));
        
        while((even = Even.readLine()) != null){
            System.out.print(even);
        }
        System.out.print("\n");
        Even.close();
        
        while((even = Odd.readLine()) != null){
            System.out.print(even);
        }
        
        Odd.close();

    }
    
    public static void main(String args[]) throws IOException{
        ReadWrite r = new ReadWrite();
        r.write(10);
        r.read();
    }
    
}
