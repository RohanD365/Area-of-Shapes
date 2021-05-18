/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areashapes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleArea extends AreaShapes {
    
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
        System.out.println("This will calculate the area of a triangle.");
        
        
        System.out.println("The value of the base and height must not be less than 0!");
        System.out.println("");
        System.out.println("What is the base of the triangle.");
        
        while (true){
          
            this.base=getValue("B: ");
            if (this.base > 0) break;
            else System.out.println("The base must not be less than 0");
        }
        
        while (true){
            System.out.println("What is the height of the triangle.");
            this.height=getValue("H: ");
            if (this.height > 0) break;
            else System.out.println("The height must not be less than 0"); 
            
            
        }    
            
            
            
    }
    
    public double findArea (){
       return Math.round (base*height/2*100d)/100d; 
        
    }
    
    public void results (Object area){
        System.out.println("");
        System.out.println("The area of the triangle is " +this.findArea());
    }
    
    
    
    
    
    
    
}
