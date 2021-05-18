/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areashapes;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.*;


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
    
    public void userInput(){
        // allow user to enter the a, b, anc c values of a standard equation
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("This will calculate the area of a circle.");
        
        System.out.println("The value of the radius not be less than 0!");
        System.out.println("");
        System.out.println("What is the radius of the circle.");
        
        while (true){
          
            this.radius=getValue("R: ");
            if (this.radius > 0) break;
            else System.out.println("The radius must not be less than 0.");
        }
        
                  
            
    }
    
    public double findArea (){
       return Math.round (PI*radius*radius*100d)/100d; 
        
    }
    
    public void results (Object Area){
        System.out.println("");
        System.out.println("The area of the circle is " +this.findArea());
    }
    
    
    
    
    
    
    
}