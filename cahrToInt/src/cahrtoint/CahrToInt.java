/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cahrtoint;
import java.util.Scanner;

public class CahrToInt {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a symbol or letter in alphabet: ");
        char val = input.next().charAt(0);
        
        int i = (int)val;
        System.out.printf("the character %c has a ascii value of %d",val,i);
        
    }
    
}
