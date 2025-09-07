
package com.t4t1n.rootsquare;

import static java.lang.Math.sqrt;

/**
 *
 * @author Jaimisky
 */
public class Calculator {
    
    private int number;
    
    public Calculator(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    // Method to calculate the root
    public void calculateRootSquare() {
        double rootSquare = sqrt(this.number);
    }
    
}
