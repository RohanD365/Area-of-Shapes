/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areashapes;

import java.util.Scanner;
import java.util.InputMismatchException;



public class AreaShapes {

    double length;
    double width;
    double base;
    double height;
    double radius;
    
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
        System.out.println("This program will calculate the area of a few 2-D shapes.");
        System.out.println("The value of the length and width must not be less than 0!");
        System.out.println("What is the length of the rectangle.");
        
        while (true){
          
            this.length=getValue("L: ");
            if (this.length > 0) break;
            else System.out.println("The length must not be less than 0");
        }
        
        while (true){
            System.out.println("What is the width of the rectangle.");
            this.width=getValue("W: ");
            if (this.width > 0) break;
            else System.out.println("The width must not be less than 0"); 
            
            
        }    
            
            
            
    }
    
    public double findArea (){
       return Math.round (length*width*100d)/100d; 
        
    }
    
    public void results (Object area){
        
        System.out.println("The area of the rectangle is " +this.findArea());
    }
    
    
    
    
    public static void main(String[] args) {
        AreaShapes a1 = new AreaShapes();
        a1.userInput();
        a1.results(a1);
        
        TriangleArea a2 = new TriangleArea();
        a2.userInput();
        a2.results(a2);
        
        CircleArea a3 = new CircleArea();
        a3.userInput();
        a3.results(a3);
        
    }
    
}
