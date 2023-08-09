/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 *
 * @author nazal
 */
public class Queues {
    public static void main(String[] args) {
        ArrayDeque list = new ArrayDeque();
        list.add(1);
        list.add("siu");
        list.addFirst(10);
        list.addLast(99);
        
        for(Object x : list){
            System.out.print(x + " ");
        }
        
        PriorityQueue que = new PriorityQueue();
        que.add(2);
        que.add(3);
        que.add(1);
        System.out.println("\n");
        for(Object y:que){
            System.out.print(y+" ");
        }
    }
}
