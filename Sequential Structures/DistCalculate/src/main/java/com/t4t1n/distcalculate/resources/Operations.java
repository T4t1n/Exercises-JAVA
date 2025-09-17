
package com.t4t1n.distcalculate.resources;

/**
 *
 * @author Jaimisky Cellez
 */
public class Operations {
    
    
    
    public static double distance(int hypotenuse, double angle) {
        double cosAngle = Math.sin(Math.toRadians(angle));
        return hypotenuse * cosAngle;
    }
}
