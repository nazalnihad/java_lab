/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// package SleepingBarber;
import java.util.concurrent.Semaphore;
/**
 *
 * @author nazal
 */

class Barbershop
{
    private final int numChairs;
    private int numCustomersWaiting = 0;
    private Semaphore barber = new Semaphore(1);
    private Semaphore customers = new Semaphore(0);
    private Semaphore mutex = new Semaphore(1);
    
    public Barbershop(int numChairs)
    {
        this.numChairs=numChairs;
    }
    
    public void enterBarbershop(int customerId) throws InterruptedException
    {
        mutex.acquire();
        if(numCustomersWaiting<numChairs)
        {
            numCustomersWaiting++;
            mutex.release();
            
            customers.release();
            barber.acquire();
            
            System.out.println("Customer "+customerId+" is getting haircut");
            barber.release();
        }
        else
        {
            mutex.release();
            System.out.println("Customer "+customerId+" left because the waiting room is full");
        }
    }
    
    public void barberCutHair(int barberId) throws InterruptedException
    {
        while(true)
        {
            customers.acquire();
            mutex.acquire();
            
            numCustomersWaiting--;
            
            System.out.println("Barber "+barberId+" is cutting hair");
            
            Thread.sleep(2000);
            
            System.out.println("Barber "+barberId+" finished cutting hair");
            barber.release();
        }
    }
    
}

class Customer implements Runnable
{
    private final Barbershop barbershop;
    private final int id;
    
    public Customer(Barbershop barbershop, int id)
    {
        this.barbershop=barbershop;
        this.id=id;
    }
    public void run()
    {
        try
        {
            barbershop.enterBarbershop(id);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class Barber implements Runnable
{
    private final Barbershop barbershop;
    private final int id;
    
    public Barber(Barbershop barbershop, int id)
    {
        this.barbershop=barbershop;
        this.id=id;
    }
    public void run()
    {
        try
        {
            barbershop.barberCutHair(id);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    
}

public class SleepingBarber {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numChairs=5;
        int numCustomers=10;
        int numBarbers=2;
        
        Barbershop barbershop = new Barbershop(numChairs);
        
        for(int i=0; i<numCustomers; i++)
        {
            Thread customerThread= new Thread(new Customer(barbershop, i));
            customerThread.start();
        }
        for(int i=0; i<numBarbers; i++)
        {
            Thread barberThread= new Thread(new Barber(barbershop, i));
            barberThread.start();
        }
        
    }
    
}