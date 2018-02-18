/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr9l10;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Y700
 */
public class Car implements Runnable{
    
    int time;
    ArrayList <Road> trasa;
    int nrTrasy;
     AllTimes t;

    public void setNrTrasy(int nrTrasy) {
        this.nrTrasy = nrTrasy;
    }


    public void setT(AllTimes t) {
        this.t = t;
    }
    
    

    public void setTrasa(ArrayList<Road> trasa) {
        this.trasa = trasa;
    }
    
    public Car ()
    {
        
    }
    
    @Override
    public void run() {
        long start1 = System.currentTimeMillis();
        for(Road t : trasa)
        {
            try {

                long start = System.currentTimeMillis();


                t.driveInside();

                Thread.sleep(t.getTime());

                t.driveOut();
                long stop = System.currentTimeMillis();
                t.setRzeczywistyCzasPrzejazdu((int) (stop - start));


            } catch (InterruptedException ex) {
                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        long stop1 = System.currentTimeMillis();
        long saveTime = (stop1 - start1);
        
        
        t.setTimeAB(saveTime);
        
        /*if(nrTrasy == 1)
            t.setTimeAXB(saveTime);
        else if (nrTrasy == 2)
            t.setTimeAYB(saveTime);
        else if(nrTrasy == 3)
            t.setTimeAYXB(saveTime);*/
            
            
        
    }
    
    
}
