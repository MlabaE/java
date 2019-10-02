/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computearea;
import java.util.Scanner;

public class ComputeArea {
    
    final static double PI=3.14159;              // constant pi value

    public static double Area(double rVal)               //method to calculate area
    {
        return rVal*rVal*PI;
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("calculate area");
       System.out.println("----------------");
       System.out.print("enetr Radius value: ");
       double radiusValue=input.nextDouble();
       
       System.out.println("Area is: " + Area(radiusValue) );
       
    }
    
}
