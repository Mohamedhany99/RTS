/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.sun.corba.se.impl.logging.ORBUtilSystemException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
/**
 *
 * @author aa
 */
public class Elevator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Disable logging
        Logger.getRootLogger().setLevel(Level.OFF);
        
        EPServiceProvider engine = EPServiceProviderManager.getDefaultProvider();
        engine.getEPAdministrator().getConfiguration().addEventType(requestelevator.class);
        
        
        String query1 = "select floor from requestelevator";
        EPStatement statm = engine.getEPAdministrator().createEPL(query1);
        statm.setSubscriber(new Object()
                {
                    public void update(double f)
                    {
                        System.out.println("the floor now is = "+f);
                    }
                }
        );
        engine.getEPRuntime().sendEvent(new requestelevator(3));
}
}
