/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import esper.config;

import events.ElevatorState;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aa
 */
public class motor {
    

    private final Elevator Elevator;
    private int floornum;
    public  boolean IsWorking;
   

    public motor(Elevator Elevator){
    
        this.Elevator = Elevator;
    }
    
    public void turn_on(){
    
        IsWorking=true;
    }
    
    public void turn_off(){
     
        IsWorking=false;
    }
    
    public int elevator_down(int currentFloor, int desiredFloor)
    {
        while(currentFloor!=desiredFloor){
     
        this.floornum-=1;
        
        }
        turn_off();
        return floornum;
        
    }
    
    public int elevator_up(int currentFloor, int desiredFloor)
    {
        while(currentFloor!=desiredFloor){
     
        this.floornum+=1;
        
        }
        turn_off();
        return floornum;
    }
    
    
    public void run(){
       
        System.out.println("elevator's Motor has been started");
      
       
         while(true){
            if(IsWorking==true){
                try {
                floornum++;
                System.out.println("");
                config.sendEvent(new ElevatorState(true));
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(motor.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
}}}
