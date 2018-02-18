/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr9l10;

/**
 *
 * @author Y700
 */
public class Road {
    int car;
    int time;
    int amountOfCars;
    int maxCars;
    private int rzeczywistyCzasPrzejazdu;
    private int countCars;

    public Road(int time, int maxCars) {
        
        this.time = time;
        this.amountOfCars = 0;
        this.maxCars = maxCars;
        this.rzeczywistyCzasPrzejazdu = 0;
        this.countCars = 0;
        
    }
    
    synchronized public int driveInside() throws InterruptedException       //wjedz
    {
     
        while (amountOfCars >= maxCars)     //jesli nie moze wjechac
        {
            wait();
        }
        
        amountOfCars++;
        return 0;
        
    }

    public int getRzeczywistyCzasPrzejazdu() {
        if(countCars == 0)
            return 0;
        return rzeczywistyCzasPrzejazdu/countCars;
    }

    
    public synchronized void setRzeczywistyCzasPrzejazdu(int rzeczywistyCzasPrzejazdu) {
        this.rzeczywistyCzasPrzejazdu += rzeczywistyCzasPrzejazdu;
        this.countCars++;
    }
    
    synchronized public int driveOut()
    {
        amountOfCars--;
        notify();
        return 0;
        
    }

    public int getTime() {
        return time;
    }
    
    
    
}
