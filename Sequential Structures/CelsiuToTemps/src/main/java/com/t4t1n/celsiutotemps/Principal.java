
package com.t4t1n.celsiutotemps;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jaimisky
 */
public class Principal {
    
    Scanner sc = new Scanner(System.in);
    Temperature temp = new Temperature();
    String toKeepOn = "Y";
    public void menu() {
        String welcome = """
                     Program that converts one temperature scale to another!
                     -------------------------------------------------------
                     """;
    
        System.out.println(welcome);
        
        while(toKeepOn.equalsIgnoreCase("Y")) {
            try{
            System.out.println("Enter the temperature in degrees Celsius: ");
            temp.setDegree(sc.nextInt());
            
            
            
            
            }catch(InputMismatchException e){
                    System.out.print("Error: " + e);
            }
            
           
           System.out.println("Do you want to keep on? Y/N");
            toKeepOn = sc.nextLine();
            while(!toKeepOn.equalsIgnoreCase("Y") && !toKeepOn.equalsIgnoreCase("N")){
                
                System.out.println("Error: Character invalid!");
                System.out.println("Do you want to keep on? Y/N");
                toKeepOn = sc.nextLine();
            }
                 
        }
        
    }
}
    
