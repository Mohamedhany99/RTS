/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Dr.mgalal
 */
public class Elevator {

   boolean Direction;
   int current_floor;
   float weight;
   Maintenance_System Maintenance_System;
   Sensors Sensors;
   Motor Motor;
   Power_Source Power_source;
   
   public void Move(){};
   public int Stop(){return 0;};
   public void open(){};
   public void close();
   public void SetWeight(float);
   public float GetWeight();
   public void SetState(ElevatorState);
   public int GetDestination();
   public int SetDestination(int);
   public int GetCurrentFloor();
   public void SetCurrentFloor(int);




    
}
