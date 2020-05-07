/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hager
 */
public class floor_button {
    
    private int floor_numb;
    private final boolean direction;
    
    public floor_button(boolean Floor)
    {
        this.direction=Floor;
    }
    public boolean getmotorstate()
    {
        return direction;
    }
    
   
}
