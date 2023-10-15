/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author nazal
 */
class utility{
    int i;
    boolean bool = false;
    
    public synchronized void set(int i) throws InterruptedException{
        while(bool){
            wait();
        }
        this.i = i;
        bool = true;
        System.out.println("Producer producing "+ i);
        notify();
    }
    
        public synchronized void get() throws InterruptedException{
        while(!bool){
            wait();
        }
        bool = false;
        System.out.println("Consumer consuming "+ i);
        notify();
    }
}

class Consumer extends Thread{
    private utility util;
    public Consumer(utility util){
        this.util = util;
        Thread consumer = new Thread(this,"Consumer");
        consumer.start();
    }
    
    public void run(){
        while(true){
        try{
            util.get();
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            
        }
        }
    }
}

class Producer extends Thread{
    private utility util;
    public Producer(utility util){
        this.util = util;
        Thread producer = new Thread(this,"producer");
        producer.start();
    }
    
    public void run(){
        int i=0;
        while(true){
        try{
            util.set(++i);
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            
        }
        }
    }
}

public class ConsProd {
    public static void main(String args[]){
        utility u = new utility();
        new Producer(u);
        new Consumer(u);

    }
}
