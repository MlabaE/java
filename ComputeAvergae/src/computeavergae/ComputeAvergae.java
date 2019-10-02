/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computeavergae;
import java.util.Scanner;
/**
 *
 * @author mlaba
 */
public class ComputeAvergae {

    public static double averageOfNums(double num1,double num2,double num3)
    {
        double sum=num1 + num2 + num3;
        
        return (sum/3.0);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       //initialize scanner
        
        System.out.println("Enter 3 values : ");
        
        System.out.print("value 1 : ");
        double val1=input.nextDouble();              //get first user value
        System.out.print("value 2 : ");
        double val2=input.nextDouble();              //get second user value
        System.out.print("value 3 : ");
        double val3=input.nextDouble();              //get third user value 
       
        double avgVal=averageOfNums(val1,val2,val3);
        
        System.out.printf("Average is :%f " , avgVal);
        
    }
    
}
