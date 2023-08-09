/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author nazal
 */
public class Array_list {
    public static void main(String[] args) {
        int[] x = {1,2,3};
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(3);
        myList.add(4);
        myList.add(5);
        
        for(Integer y:myList){
            System.out.print(y);
        }
        
        System.out.println("\n");
        for(Iterator it=myList.iterator(); it.hasNext();){
            System.out.print(it.next()+" ");
        }
        
        myList.add(2,4);
        System.out.println("\n");
        for(Iterator it=myList.iterator(); it.hasNext();){
            System.out.print(it.next()+" ");
        }
        
        myList.sort(Comparator.naturalOrder());
        System.out.println("\n");
        for(Iterator it=myList.iterator(); it.hasNext();){
            System.out.print(it.next()+" ");
        }
        
        myList.sort(Comparator.reverseOrder());
        System.out.println("\n");
        for(Iterator it=myList.iterator(); it.hasNext();){
            System.out.print(it.next()+" ");
        }
        
        myList.remove(1);
        System.out.println("\n");
        for(Iterator it=myList.iterator(); it.hasNext();){
            System.out.print(it.next()+" ");
        }

    }
}
