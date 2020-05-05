/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL
 */
public class Door {
    private boolean isOpen;
 
public Door(boolean isOpen) {
    this.isOpen = isOpen;
}

public boolean isOpen() {
    return isOpen;
}

public void setState(boolean state) {
    this.isOpen = state;
}
public void open() {

    isOpen = true;
}
public void close() {

    isOpen = false;

}
}
