/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractnameandsurname;
import java.util.Scanner;

public class ExtractNameAndSurname {

    public static void main(String[] args) {
        System.out.print("enter your full name: ");
        Scanner input = new Scanner(System.in);
        String fullname=input.nextLine();
        int k = fullname.indexOf(' ');
        String firstName = fullname.substring(0 , k);
         String lastName = fullname.substring(k + 1);
         
        System.out.printf("is your first name: %s and last name: %s ? y/n: ",firstName,lastName);
        char val = input.next().charAt(0);
        
        if(val=='y')
        {
            System.out.printf("welcome mr %s. %s to java.",firstName.charAt(0),lastName);
            
        }
        else System.out.print("We apologise for the error , please try again");
        
    }
    
}
