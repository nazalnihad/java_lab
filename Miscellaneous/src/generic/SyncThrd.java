/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author nazal
 */
class task extends Thread{
    @Override
    synchronized public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("yo "+i);
    }
    }
}

class task2 implements Runnable{
    @Override
    synchronized public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print("\nsiuu "+i);
    }
    }
}
public class SyncThrd {
    public static void main(String args[]) throws InterruptedException{
        task t = new task();
        Runnable r = new task2();
        Thread rr = new Thread(r);
        rr.start();
//        rr.join();
        t.start();
    }
}
