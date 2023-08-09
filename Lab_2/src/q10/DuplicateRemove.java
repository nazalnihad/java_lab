/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q10;

import java.util.Arrays;
import java.util.TreeSet;

/**
 *
 * @author nazal
 */
public class DuplicateRemove {
    public static void main(String[] args) {
        String[] array = {"babu", "ramu", "babu", "apple", "apple", "ramanan", "damu"};
        System.out.println("Before removing duplicates ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        TreeSet<String> set = new TreeSet<>();

        for (String element : array) {
            set.add(element);
        }

        String[] dupeRemoved = new String[set.size()];
        set.toArray(dupeRemoved);

        System.out.println("\n\nAfter removing duplicates ");
        for(int i=0;i<dupeRemoved.length;i++){
            System.out.print(dupeRemoved[i] + " ");
        }
    }
}
