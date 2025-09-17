

package com.t4t1n.distcalculate;


import static com.t4t1n.distcalculate.resources.Operations.distance;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Jaimisky Cellez
 */
public class DistCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RightTriangle t = new RightTriangle();
        String toKeep = "Y";
        System.out.println("Program that calculates the distance from the ladder's base to the building!");
        System.out.println("----------------------------------------------------------------------------");
        while(toKeep.equalsIgnoreCase("Y")) {
            try {
            System.out.println("Enter the hypotenuse (in meters) and the angle(in degrees), where 0 < angle < 90");
            t.setHypotenuse(sc.nextInt());
            t.setAngle(sc.nextInt());
            t.setDistance(distance(t.getHypotenuse(), t.getAngle()));
            System.out.println(t.toString());
            } catch(InputMismatchException e) {
                System.out.println("Error: " + e);
            }
            sc.nextLine();
            System.out.println("Do you want to keep on? Y/N");
            toKeep = sc.nextLine();
            while(!toKeep.equalsIgnoreCase("Y") && !toKeep.equalsIgnoreCase("N")){
                
                System.out.println("Error: Character invalid!");
                System.out.println("Do you want to keep on? Y/N");
                toKeep = sc.nextLine();
            }
         
        }
    }
}
