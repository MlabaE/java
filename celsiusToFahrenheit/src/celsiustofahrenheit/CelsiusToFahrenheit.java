/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiustofahrenheit;
import java.util.Scanner;

public class CelsiusToFahrenheit {

   public static double fVal(double cVal)
   {
       return (9.0/5)*cVal+32;
   }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Converting Celsius to Fahrenheit");
        System.out.println("---------------------------------");
        
        System.out.print("Celsius : ");
        double celsius = input.nextDouble();
        
        System.out.println("Fahrenheit: " + fVal(celsius));
        
    }
    
}
