/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;
import java.util.Scanner;
/**
 *
 * @author mlaba
 */
public class Bubblesort {

   
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
         String tempstr;
         
         System.out.print("enter a word:");
         String str=input.nextLine();  
         
        String t1[] = str.split(", ");
         
        for (int i = 0; i < t1.length-1; i++) {
            for (int j= 0; j < t1.length; j++) {
                if(t1[j-1].compareTo(t1[j])>0) {
                    tempstr = t1[i];
                    t1[i] = t1[j];
                    t1[j] = tempstr;
                }
            }
        }
        
         System.out.print("Strings in Sorted Order:");
        for(int i = 0; i < t1.length; i++)
        {
            System.out.println(t1[i]);
        }
         
    }
    
}
