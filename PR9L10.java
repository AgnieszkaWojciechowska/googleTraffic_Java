/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr9l10;

import java.util.ArrayList;

/**
 *
 * @author Y700
 */
public class PR9L10 {

    /**
     * @param args the command line arguments
     */
    
        private static Road drogaAX = new Road(50, 100);
        private static Road drogaAY = new Road(10, 50);
        private static Road drogaXB = new Road(10,50);
        private static Road drogaYB = new Road(50, 100);
        private static Road drogaYX = new Road(20, 30);
        private static int dodatkowaDroga = 1;         //jesli 1 istnieje
        private static int nrWybTrasy;
        
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        AllTimes timeA = new AllTimes();
        Car car;
        Thread t;
        ArrayList <Thread> allCars = new ArrayList();
        ArrayList <Road> trasa = new ArrayList();
        for(int i = 0; i < 12000; i++)
        {
            trasa = new ArrayList();
            trasa = trasy();
            
            car = new Car();
            car.setTrasa(trasa);
            car.setT(timeA);
            car.setNrTrasy(nrWybTrasy);
            
            t = new Thread(car);
            t.start();
            allCars.add(t);
        }   
        
        for(Thread thread : allCars)
        {
            thread.join();
        }
        System.out.println(timeA.getTimeAB());
        
    }
    
    private static ArrayList<Road> trasy ()
    {
        ArrayList <Road> wszystkieTrasy = new ArrayList();
        if(drogaAX.getRzeczywistyCzasPrzejazdu() < drogaAY.getRzeczywistyCzasPrzejazdu())
        {
            wszystkieTrasy.add(drogaAX);
            wszystkieTrasy.add(drogaXB);
            nrWybTrasy = 1;
        }
        else
        {
            wszystkieTrasy.add(drogaAY);
            if(dodatkowaDroga == 1 && drogaYX.getRzeczywistyCzasPrzejazdu() < drogaYB.getRzeczywistyCzasPrzejazdu())
            {
                wszystkieTrasy.add(drogaYX);
                wszystkieTrasy.add(drogaXB);
                nrWybTrasy = 3;
            }
            else
            {    
                wszystkieTrasy.add(drogaYB);
                nrWybTrasy = 2;
            }
            
        }
        
        return wszystkieTrasy;
        
    }
    
}
