
package com.t4t1n.distcalculate.resources;

/**
 *
 * @author Jaimisky Cellez
 */
public class Operations {
    
    
    
    public static double distance(int hypotenuse, double angle) {
        double cosAngle = Math.cos(Math.toRadians(angle));
        System.out.println(cosAngle);
        return hypotenuse * cosAngle;
    }
}
