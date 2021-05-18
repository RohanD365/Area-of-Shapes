/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areashapes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rajdo
 */
public class CircleArea extends AreaShapes {
    public double getValue(String instruction){
        // helper method to bullet proof and force user to enter a double value
        System.out.print(instruction);
        Scanner input = new Scanner(System.in);
        double val;
        while (true){
            try{
                val=input.nextDouble();
                break;
            }
            catch (InputMismatchException err){
                input.next();
                System.out.print("Not a number, try again! "+instruction);
            }
        }
        return val;
    }
    
}
