/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author hager
 */
public class RequestedFloor {
 
    private final int rFloor;
    
    public RequestedFloor(int rFloor)
    {
        this.rFloor = rFloor;
    }
    
    public int getFloorNum() {
        return rFloor;
    }
}
    
