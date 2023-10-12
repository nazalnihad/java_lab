/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BoundedBuffer;

import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author nazal
 */
class BoundedBuffer
{
    private final ArrayBlockingQueue<Integer> buffer;
    
    public BoundedBuffer(int capacity)
    {
        buffer=new ArrayBlockingQueue<>(capacity);
    }
    
    public void produce(int item) throws InterruptedException
    {
        buffer.put(item);
        System.out.println("Produced: "+item);
    }
    
    public int consume() throws InterruptedException
    {
        int item=buffer.take();
        System.out.println("Consumed: "+item);
        return item;
    }
}

class Producer implements Runnable
{
    private BoundedBuffer buffer;
    private int value=0;
    
    public Producer(BoundedBuffer buffer)
    {
        this.buffer=buffer;
    }
    
    public void run()
    {
        try
        {
            while(true)
            {
                buffer.produce(value);
                value++;
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable
{
    private BoundedBuffer buffer;
    
    public Consumer(BoundedBuffer buffer)
    {
        this.buffer=buffer;
    }
    
    public void run()
    {
        try
        {
            while(true)
            {
                buffer.consume();
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
}

public class BoundedBufferExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BoundedBuffer buffer= new BoundedBuffer(5);
        
        Thread producerThread= new Thread(new Producer(buffer));
        Thread consumerThread= new Thread(new Consumer(buffer));
        
        producerThread.start();
        consumerThread.start();
    }
    
}