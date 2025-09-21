
package com.t4t1n.distcalculate;

/**
 *
 * @author Jaimisky Cellez
 */
public class RightTriangle {
    private double hypotenuse;
    private double angle;
    private double distance;
    
    public RightTriangle() {
    }
    
    RightTriangle(double hypotenuse, double angle, double distance) {
        this.hypotenuse = hypotenuse;
        this.angle = angle;
        this.distance = distance;
    }

    public int getHypotenuse(){
        return (int) hypotenuse;
    }

    public void setHypotenuse(double hypotenuse){
        this.hypotenuse = hypotenuse;
    }

    public int getAngle() {
        return (int) angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
    
    public double getDistance() {
        return distance;
    }
    
    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    public String toString() {
        return """
                                  Data and results
               ------------------------------------------------------
               
               Hypotenuse  <ladder's lenght in meters>:            %d
               Angle in degrees of the ladder:                     %d
               Distance of the ladder to the building in meters:   %.4f
               
               ------------------------------------------------------
               """.formatted(getHypotenuse(), getAngle(), getDistance());
    }
}
