/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import esper.config;
import events.CurrentFloor;
import events.ElevatorFloor;
import events.ElevatorState;
import events.RequestedFloor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;  // Import the Scanner class
import java.util.concurrent.Semaphore;
import view.ElevatorView;
/**
 *
 * @author Dr.mgalal
 */
public class Elevator {

   //boolean Direction;
   int current_floor;
   //float weight;
   private Maintainance_System Maintainance_System;
   private sensors Sensors;
   private motor Motor;
   private Buzzer Buzzer;
   
   
   //public void Move(){};
   
   
    //public int Stop(){return 0;};
   //public void open(){};
   //public void close(){};
   
   //public void SetState(ElevatorState){};
  
   
   //public int GetDestination(){};
   //public int SetDestination(int){};
   
   public int GetCurrentFloor(){
       return current_floor; 
   
   
   
   };
   public void SetCurrentFloor(int currentFloor){
   
   this.current_floor=currentFloor;
   
   
   };
   
   public void CheckCallFloor(int userFloor, int elevFloor){
   
   if(userFloor<elevFloor){
       Motor.turn_on();
       Motor.elevator_down(userFloor, elevFloor);
       
       config.sendEvent(new ElevatorState(true));
       config.sendEvent(new CurrentFloor(userFloor));
       config.sendEvent(new ElevatorFloor(elevFloor));
       System.out.println("The elevator has arrived");
       
       
       
   
   }else {
   Motor.turn_on();
   Motor.elevator_up(userFloor, elevFloor);
   
       config.sendEvent(new ElevatorState(true));
       config.sendEvent(new CurrentFloor(userFloor));
       config.sendEvent(new ElevatorFloor(elevFloor));
       System.out.println("The elevator has arrived");
   
   }
       
   }
   public void CheckRequestedFloor(int elevFloor, int requestedFloor){
   
   if(elevFloor<requestedFloor){
   
       Motor.elevator_up(elevFloor, requestedFloor);
       Motor.turn_on();
       config.sendEvent(new ElevatorState(true));
       config.sendEvent(new RequestedFloor(requestedFloor));
       config.sendEvent(new ElevatorFloor(elevFloor));
       System.out.println("You are arrived your requested distenation");
       
   
   }else {
       
       Motor.elevator_down(elevFloor, requestedFloor);
       Motor.turn_on();
       config.sendEvent(new ElevatorState(true));
       config.sendEvent(new RequestedFloor(requestedFloor));
       config.sendEvent(new ElevatorFloor(elevFloor));
       System.out.println("You are arrived your requested distenation");
   }
       
   }
   


 public void test() 
    {
        System.out.println("HELP!");
    }

    
    
}
