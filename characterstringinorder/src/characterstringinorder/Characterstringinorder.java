/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstringinorder;

import java.util.Scanner;

import java.util.Arrays;
/**
 *
 * @author mlaba
 */
public class Characterstringinorder {

    public static String sortString(String inputString) 
    { 
        
        char tempArray[] = inputString.toCharArray();        // convert input string to char array   
         
        Arrays.sort(tempArray);                               // sort tempArray 
        
        return new String(tempArray);                         // return new sorted string
    } 
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.println("enter a word:");
         String inputString=input.nextLine();                //retrieve user input
         
        String outputString = sortString(inputString);          //call method
          
        System.out.println("Input String : " + inputString); 
        System.out.println("Output String : " + outputString);      //display
    }
    
}
