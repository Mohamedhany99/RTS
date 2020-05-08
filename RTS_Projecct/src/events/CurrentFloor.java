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
public class CurrentFloor {
    private final int cFloor;
    
    public CurrentFloor(int cFloor)
    {
        this.cFloor = cFloor;
    }
    
    public int getFloorNum() {
        return cFloor;
    }
    
}
