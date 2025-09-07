

package com.t4t1n.rootsquare;

import java.util.Scanner;

/**
 *
 * @author Jaimisky
 */
public class RootSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keepGoing = "s";
        while(keepGoing.equalsIgnoreCase("s")) {
            String textMain = """ 
                          Program that caculates the square root and the square of a number!
                          -----------------------------------------------------
                          """;
            System.out.println(textMain);
            System.out.println("Enter a number: "); 
            Calculator calculator = new Calculator(sc.nextInt());
            calculator.calculateRootSquare();
            calculator.calculateSquare();
            System.out.println(calculator.toString());
            System.out.println("Do you want to continue?");
            sc.nextLine();
            keepGoing = sc.nextLine();
        }
    }
}