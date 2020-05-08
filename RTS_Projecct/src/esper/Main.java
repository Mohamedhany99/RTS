/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esper;

import Model.Elevator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author hager
 */
public class Main {
     public static void main(String[] args) {

        // Disable logging
        Logger.getRootLogger().setLevel(Level.OFF);

        // Register events
        config.registerEvents();
        
        final Elevator Elevator = new Elevator();
        
        config.createStatement("")
                .setSubscriber(new Object() {
                    public void update(int floornum) {
                  //   Elevator.full_speed_spin(min);
                    }
                });
    }
}
