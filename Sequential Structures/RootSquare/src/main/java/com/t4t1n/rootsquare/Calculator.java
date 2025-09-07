
package com.t4t1n.rootsquare;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Jaimisky
 */
public class Calculator {
    
    private double number;
    
    public Calculator(double number){
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
    
    // Method to calculate the square root
    double squareRoot;
    public void calculateRootSquare() {
        squareRoot = sqrt(this.number);
    }
    
    // Method to calculate the square
    double square;
    public void calculateSquare() {
        square = pow(this.number, 2);
    }
    
    @Override
    public String toString() {
        return  "Print data and results" + '\n' +
                "----------------------------" + '\n' +
                "The input number is:    " + (int) number + '\n' +
                "The square root is:     " + (int) squareRoot + '\n' +
                "The number's square is: " + (int) square + '\n' +
                "----------------------------";
    }
}
