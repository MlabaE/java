/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chasierapplication;
import java.util.Scanner;
import java.lang.reflect.Array;
/**
 *
 * @author mlaba
 */
public class ChasierApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        stockAndCalc s = new stockAndCalc() ;
        Scanner input = new Scanner(System.in);
        
        int itemCount = 1 ,count = 1;
        int quantity = 0; 
        int choice = 0;
        
        System.out.println("menu: ");
        for (int i = 0; i < s.myStock.length; i++) {  
            String x = (String)Array.get(s.myStock, i); 
            int j = (int)Array.get(s.quantity,i);
            System.out.println(count+" : "+ x + "( " + j + " )"); 
            count++;
        } 
        
        System.out.println("enter what groceries you want(e.g: 1) and how many of them you want(e.g:2) :");
        
        while(choice != -1)
        {
            System.out.print("item"+itemCount+" : ");
            choice = input.nextInt();
            s.setArrayChoice(choice);
            if(choice == -1)
            {
              //  System.out.printf("total price of groceries is %f ",s.sumTotal);
            //    System.out.print("how much money do you have ?:");
               System.out.println("payment method:"); 
               System.out.print("1/Visa , 2/Credit Card ,3/American Express, 4/Master : ");
               System.out.println(); 
                break;
            }
            System.out.print("quantity : ");
            quantity = input.nextInt();
            s.setQuant(quantity);
            s.quantitySub();
            s.runCalc();
            s.Discount();
            itemCount++;
        }
        
       // double userAmount = input.nextDouble();
       // s.setChange(userAmount);
      //  System.out.printf("change : %f",s.getChange());
      
      int pMethod = input.nextInt();
      s.paymentMethod(pMethod);
      
      System.out.print("please enter distance from shop: ");
      double distance = input.nextDouble();
      s.setKilometers(distance);
      System.out.printf("you are %f kilometers away.", distance);
      System.out.printf("it costs R%f for delivery", s.delivery());
      
      System.out.println();
      System.out.println("menu: ");
        for (int i = 0; i < s.myStock.length; i++) {  
            String l = (String)Array.get(s.myStock, i); 
            int m = (int)Array.get(s.quantity,i);
            System.out.println(count+" : "+ l + "( " + m + " )"); 
            count++;
        } 
      
    }
    
}
