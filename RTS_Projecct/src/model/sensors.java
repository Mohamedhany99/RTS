/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.config;
import events.ElevatorFloor;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */





// this class display the elevator current floor 
public class sensors extends Thread{
   
   private boolean state;
   private int floorNum;

    public sensors() {
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }
   
    public sensors(boolean state, int floorNum) {
        this.state = state;
        this.floorNum = floorNum;
    }
   
    private int floor(int min, int max) {
    if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
}
    public void elevator_idle() {
        if (floorNum > 20) {
            floorNum -= floor(1, 20);
        } else {
            floorNum += floor(1, 20);
        }
}
    
    @Override
    public void run() {
        while (true) {
            
            try {
                sensors.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(sensors.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            config.sendEvent(new ElevatorFloor(floorNum));
        }
    }
}
        
