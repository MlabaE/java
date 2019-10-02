/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaordering;

/**
 *
 * @author mlaba
 */
public class menu {
    
    
    String[] pizzaList = {"Hawaian","Magherita","Regina","Triple meat","Nepolean","Meat supreme","The chicken father","Ribster pizza","Mexican pizza","Chip pizza"};
    double[] pizzaPrice = {68.90,54.90,68.90,68.90,69.90,79.90,69.90,77.90,69.90,69.90};
    
    String[] extras = {"cheese","peperoni","avo","sauce","chicken/meat/rib","none"};
    double[] extrasPrice = {12.90,24.90,12.90,12.90,29.90,0.0};
    
    double total , change ,sumTotal;
    int arrayChoice1,arrayChoice2, quant;
     
     menu()
     {
        total = 0.0;  
        change = 0.0;
        sumTotal = 0.0;
        //System.exit(3);
     }
    
     void setArrayChoice1(int i)//set array choice
      {
          arrayChoice1 = i;
      }
     
     void setArrayChoice2(int j)//set array choice
      {
          arrayChoice2 = j;
      }
     
      void setQuant(int q)//set quantity of items set from user
      {
          quant = q;
      }
     
      void setChange(double x)//set change 
      {
          change = x ;  
      }
      
      void runCalc() //calculate orders and produce sumtotal
      {
          total = (pizzaPrice[arrayChoice1-1] + extrasPrice[arrayChoice2-1]) * quant;
          sumTotal+=total;
      }
     
       double sumTotal()//return the overall price
      {   
          return sumTotal;
      }
       
       double getChange()//return the change customer needs
      {
          return change - sumTotal;
      }
       
       
}
