/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcardnumbervalidation;
import java.util.Scanner;

public class CreditCardNumberValidation 
{


  public static void validateLength(String number)  
{
    if(number.length() == 13 || number.length() == 16)
    {
        validateCardType(number);
    }
    else
        System.out.print("invalid card length.");
    
    
}
public static void validateCardType(String number)
{
    char num2 = number.charAt(1);
    char num1 = number.charAt(0);
    
    switch(num1)
    {
        case '3': {
             if(num2=='7')
             {
                 System.out.println("American Express Card");
             }
        }break;
            
        case '4': System.out.println("Visa Card") ;break; 
        
        case '5': System.out.println("Master Card");break ;
        
        case '6': System.out.println("Discover Card");break ;   
    }
}

public static int sumofDoubleEvenPlace(String number)
{
    char charnum;
    int intnum;
    int sum=0;
    
    for(int x=0; x<number.length(); x+=2)
    {
        charnum = number.charAt(x);
        intnum=Character.getNumericValue(charnum) *2 ;
        
        if(intnum>9)
        {
            char intnum1 = String.valueOf(intnum).charAt(0);
            char intnum2 = String.valueOf(intnum).charAt(1);
            
            int tempintnum1 = Character.getNumericValue(intnum1);
            int tempintnum2 = Character.getNumericValue(intnum2);
            
            int newsum = tempintnum1+tempintnum2;
            sum+=newsum;
        }
        else{sum+=intnum;}
        
    }
    return sum;
}

public static int sumofOddPlace(String number)
{
    char charnum;
    int intnum;
    int sum=0;
    
    for(int x=1; x<number.length(); x+=2)
    {
        charnum = number.charAt(x);
        intnum=Character.getNumericValue(charnum) ;
        sum+=intnum;
    }
    return sum;
}

public static void finalValidation(String number)
{
    if((sumofOddPlace(number) + sumofDoubleEvenPlace(number)) % 10 == 0)
    {
        System.out.printf("the card number %s is Valid.",number);
    }
    else{
        System.out.printf("the card number %s is Not Valid.",number);
    }
}
    
 public static void main(String[] args) {
     
         Scanner input = new Scanner(System.in);
         
         System.out.println("Credit card validation ");
         System.out.println("---------------------------- ");
         
         System.out.print("Please enter your 13/16 digit credit card number: ");
         String cardNum=input.nextLine();      //get user input
         validateLength(cardNum);     //validate card length in void method
         finalValidation(cardNum);    //validate
                         
    }
    
}
