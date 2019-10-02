/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlearray;
import java.util.Scanner;
/**
 *
 * @author mlaba
 */
public class SingleArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double[] myList = new double[10];
        
        //initiallize array with user input
        System.out.println("enter 10 valid double type values : ");
        int count = 1;
        for(int i=0; i<myList.length; i++)
        {
            System.out.print("value "+count+" : ");
            myList[i] = input.nextDouble();
            count++;
        }
        System.out.println();
        //display elements in an array
         System.out.print("My list values:");
        for(int x=0; x<myList.length; x++)
        {
            System.out.print(myList[x]);
        }
         System.out.println();
         
        /* //reorder array
         System.out.print("shuffle my list: ");
         for(int i = myList.length-1; i<0; i++)
         {
            int j = (int)(Math.random() * (i+1));
            
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
         }
         //display the reoerdered list
         for(int x=0; x<myList.length; x++)
        {
            System.out.print(myList[x]);
        }
         System.out.println();*/
         
         //print total sum of elements in array
         double sumtotal = 0.0;
         
         for(int a = 0; a < myList.length; a++)
         {
             sumtotal += myList[a];
         }
         System.out.printf("the sum total of elements in array is %f",sumtotal);
         System.out.println();
         
         //find biggest element in array
         double max = myList[0];
         for(int b = 1; b < myList.length; b++)
         {
             if(max < myList[b])
             {
                 max=myList[b];
             }
         }
          System.out.printf("Biggest value: %f",max);
         System.out.println();
         
         //find the smallest element in array
         double min = myList[0];
         for(int c=0; c<myList.length; c++)
         {
             if(myList[c] < min)
             {
                 min = myList[c];
             }
         }
         System.out.printf("Smallest value: %f",min);
         System.out.println();
         
         
    }
    
}
