/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandarray;
import java.util.Scanner;
import java.lang.reflect.Array;              //used to return the element at a given index from a specified Array.
/**
 *
 * @author mlaba
 */

public class Stackandarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stack s = new stack();
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter 5 integers into array :");
 
        int count=1;
        for(int x = 0; x<5; x++)
        {
            System.out.print("value "+count+" : ");
            int value = input.nextInt();
            s.push(value);                          //push values into array
            count++;
        }
        System.out.println();
        
        System.out.print("my array : ");
        for (int i = 0; i < 5; i++) {  
            int x = (int)Array.get(s.myList, i); 
            System.out.print(x + " "); 
        } 
        System.out.println();
        
        System.out.print("would you like to pop a value from array? (Y/N) : ");
        char choice = input.next().charAt(0);
        
        if( choice == 'Y' || choice == 'y')
        {
            s.pop();
            System.out.print("top value popped.");
        }
        else{
            System.out.println("end of program");
        }
    }
    
}
