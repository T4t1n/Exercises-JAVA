
package com.t4t1n.distcalculate;

/**
 *
 * @author Jaimisky Cellez
 */
public class RightTriangle {
    private double hypotenuse;
    private double angle;
    
    public RightTriangle() {
    }
    
    RightTriangle(double hypotenuse, double angle) {
        this.hypotenuse = hypotenuse;
        this.angle = angle;
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
    
    
    public String toString() {
        return """
               hipotenusa <longitud de la escalera en m>: %d
               Ángulo en grados de la escalera: %d
               """.formatted(getHypotenuse(), getAngle());
    }
}
