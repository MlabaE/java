/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chasierapplication;

/**
 *
 * @author mlaba
 */
public class stockAndCalc {
    
     String[] myStock = {"bread","milk","beans","cheese","ham","coke","sprite","butter","lays","ketchup"};
    
     double[] price = {14.50,10.00,5.60,12.00,22.00,16.70,8.00,16.00,22.50};
     
     int[] quantity = {10,10,10,10,10,10,10,10,10,10};
     
     double total , change ,sumTotal ,calcDiscount, kilometers;
     int arrayChoice;
     int quant;
     
      stockAndCalc()//constructor
     {
        calcDiscount = 0.0; 
        total = 0.0;  
        change = 0.0;
        sumTotal = 0.0;
        kilometers = 0.0;
     }
      
      void setArrayChoice(int i)//set array choice
      {
          arrayChoice = i;
      }
      
      void setQuant(int q)//set quantity of items set from user
      {
          quant = q;
      }
      
      
      void setChange(double x)//set change 
      {
          change = x ;  
      }
      
      void setKilometers(double km)
      {
          kilometers = km;
      }
      
      double runCalc()//calculate the product of item and quantity
      {
          total = price[arrayChoice-1] * quant;
          //sumTotal+=total;
          return total;
      }
      
      double sumTotal()//return the overall price
      {   
          return sumTotal;
      }
     
      double getChange()//return the change customer needs
      {
          return change - sumTotal;
      }
      
     void  quantitySub()
      {
        
     quantity[arrayChoice-1] = quantity[arrayChoice-1]- quant;
         
      }
     
     void paymentMethod(int pm)
     {
         switch(pm){
             case 1: 
                 System.out.println("payment method visa card");
                 break;
             case 2:
                 System.out.println("payment method credit card");
                 break;
             case 3:
                 System.out.println("payment method American Express");
                 break;
             case 4:
                 System.out.println("payment method credit Master card");
                 break;
         }
     }
     
     double Discount()
     {
                 
         switch(arrayChoice-1)
         {
             case 1:
                 calcDiscount =  total*0.1;
             case 8:
                 calcDiscount = total*0.2;
             case 3:
                 calcDiscount = total*0.5;
             case 5:
                 calcDiscount = total*0.1;
         }
         
         sumTotal+=total+calcDiscount;
         return calcDiscount;
     }
     
     double delivery()
     {
         if(kilometers > 10)
             return sumTotal + (kilometers*3.34);
         else
             return sumTotal;
     }
             
}
