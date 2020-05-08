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
public class Elevertor_Door {
    
    private boolean isOpen;
    private final Elevator Elevator;


public Elevertor_Door(Elevator Elevator){
    isOpen=false;
    this.Elevator = Elevator;
    }
 

public void open() {

    isOpen = true;
}
public void close() {

    isOpen = false;

}
public boolean getdoorstatus() {
    return isOpen;
}

}

