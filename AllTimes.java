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
public class AllTimes {
    /*private int timeAXB;
    private int countAXB;
    private int timeAYXB;
    private int countAYXB;
    private int timeAYB;
    private int countAYB;*/
    private long timeAB;
    private long countAB;

    public AllTimes() {
        /*this.timeAXB = 0;
        this.countAXB = 0;
        this.timeAYXB = 0;
        this.countAYXB = 0;
        this.timeAYB = 0;
        this.countAYB = 0;*/
        this.timeAB = 0;
        this.countAB=0;
    }

    public long getTimeAB() {
        if(countAB == 0)
            return 0;
        return timeAB/countAB;
    }

    public synchronized void setTimeAB(long timeAB) {
        this.timeAB += timeAB;
        this.countAB++;
    }
    
    

    /*public int getTimeAXB() {
        return timeAXB/countAXB;
    }

    public synchronized void setTimeAXB(int timeAXB) {
        this.timeAXB += timeAXB;
        this.countAXB++;
    }

    public int getTimeAYXB() {
        return timeAYXB/countAYXB;
    }

    public synchronized void setTimeAYXB(int timeAYXB) {
        this.timeAYXB += timeAYXB;
        this.countAYXB++;
    }

    public int getTimeAYB() {
        return timeAYB/countAYB;
    }

    public synchronized void setTimeAYB(int timeAYB) {
        this.timeAYB += timeAYB;
        this.countAYB++;
    }
    */
    

    
    
    
    
}
