/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author nazal
 */
class BoundedBuffer{
    private final ArrayBlockingQueue<Integer> buffer;
    
    public BoundedBuffer(int capacity){
        buffer = new ArrayBlockingQueue<>(capacity);
    }
    
    public void produce(int item) throws InterruptedException{
        buffer.put(item);
        System.out.println("Produced "+item);
    }
    
    public int consume() throws InterruptedException{
        int item = buffer.take();
        System.out.println("Consumed "+item);
        return item;
    }
}

class Producer implements Runnable{
    private BoundedBuffer buffer;
    private int value=0;
    
    public Producer(BoundedBuffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
       try{
           while(true){
               buffer.produce(value);
               value++;
               Thread.sleep(1000);
           }
       }
       catch(InterruptedException e){
           
       }
    }
}

class Consumer implements Runnable{
    private BoundedBuffer buffer;
    
    public Consumer(BoundedBuffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
       try{
           while(true){
               buffer.consume();
               Thread.sleep(1000);
           }
       }
       catch(InterruptedException e){
           
       }
    }
}
public class bounded {
    public static void main(String args[]){
        BoundedBuffer buffer = new BoundedBuffer(5);
        Thread producer = new Thread(new Producer(buffer));
        Thread consumer = new Thread(new Consumer(buffer));
        
        producer.start();
        consumer.start();
    }
}
