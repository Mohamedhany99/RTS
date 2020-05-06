/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aa
 */
public class motor {
    private boolean state;
    public motor(boolean st)
    {
        this.state=st;
    }
    public boolean getmotorstate()
    {
        return state;
    }
    public int elevator_down(int floors)
    {
        this.floornum-=floors;
        return floornum;
    }
    public int elevator_up(int floors)
    {
        this.floornum+=floors;
        return floornum;
    }
}
