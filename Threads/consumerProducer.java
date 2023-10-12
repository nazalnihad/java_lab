/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConsumerProducer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nazal
 */
class Utility
{
    int i;
    boolean bool=false;
    public synchronized void set(int i) throws InterruptedException
    {
        while(bool)
        {
            wait();
        }
        this.i=i; 
        bool=true;
        System.out.println("Producer"+i);
        notify();
    }
    public synchronized void get() throws InterruptedException
    {
        while(!bool)
        {
            wait();
        }
        bool=false;
        System.out.println("Consumer"+i);
        notify();
    }
}

class Consumer implements Runnable
{
    private Utility utility;
    public Consumer(Utility utility)
    {
        this.utility=utility;
        Thread consumer = new Thread(this, "Consumer");
        consumer.start();
    }
    @Override
    public void run()
    {
        while(true)
        {
            try {
                utility.get();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
        }
    }
}



class Producer implements Runnable
{
    private Utility utility;
    public Producer(Utility utility)
    {
        this.utility=utility;
        Thread producer = new Thread(this, "Producer");
        producer.start();
    }
    @Override
    public void run()
    {
        int i=0;
         while(true)
         {
            try {
                utility.set(i++);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }
}



public class ConsumerProducer {
    public static void main(String[] args)
    {
        Utility u = new Utility();
        new Producer(u);
        new Consumer(u);
    }
}