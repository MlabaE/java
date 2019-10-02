/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaordering;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.lang.reflect.Array;
/**
 *
 * @author mlaba
 */ 
 
public class PizzaOrdering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu s = new menu();
        
        Scanner input = new Scanner(new InputStream() {
            @Override
            public int read() throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
       
        //initialize variables
        int count1 = 1, count2 = 1, quantity = 0, choice1 = 0, choice2 = 0, cont = -1;
        char extras;
        
        //display menu
         System.out.println("-----------------------------------------------------");
         System.out.println("pizza menu:");
         System.out.println("-----------------------------------------------------");
        for (int i = 0; i < s.pizzaList.length; i++) {  
            String x = (String)Array.get(s.pizzaList, i); 
            double a = (double)Array.get(s.pizzaPrice, i);
            System.out.printf("%d)%s\t %f ",count1,x,a);
           //System.exit(1);
            System.out.println();
            count1++;
            
        } 
        System.out.println("-----------------------------------------------------");
        System.out.println("extras: ");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < s.extras.length-1; i++) {  
            String x = (String)Array.get(s.extras, i);//.toString(); 
            double d = (double)Array.get(s.extrasPrice, i);//.hashCode();
            System.out.printf("%d)%s\t  %f",count2,x,d);
            System.out.println();
            //System.exit(1);
            count2++;
        } 
        System.out.println("-----------------------------------------------------");
        
        //process order
        System.out.println("Enter your order eg:1 and any integer value besides -1 to end order: ");
        while(cont == -1)
        {
           System.out.print("select pizza : ");
           choice1 = input.nextInt();
           if(choice1<1 || choice1>10)
           {
               System.out.println("incorrect option please try again:");
               System.out.print("select pizza : ");
               choice1 = input.nextInt();
           }
           else s.setArrayChoice1(choice1);
           
           System.out.print("would you like extras?(Y/N) :");
           extras = input.next().charAt(0);
           if(extras=='Y' || extras=='y')
           {
               //System.exit(3);
              System.out.print("select extra : ");
              choice2 = input.nextInt();
               if(choice2<1 || choice2>5)
           {
               System.out.println("incorrect option please try again:");
               System.out.print("select extra : ");
               choice2 = input.nextInt();
           }else s.setArrayChoice2(choice2);
            
           }else
               if(extras=='n' || extras=='N')
               {
                   choice2 = 6;
                   s.setArrayChoice2(choice2);
               }
               
           
            System.out.print("quantity (min 1): ");
            quantity = input.nextInt();
            if(quantity<1)
            {
               System.out.print("quantity can not be less than 1: "); 
               System.out.print("quantity: ");
               quantity = input.nextInt();
            }
            else{
            s.setQuant(quantity);
            s.runCalc();
            }
            
            System.out.print("enter -1 to continue order or any integer to cancle : ");
            int userCont = input.nextInt();
            if(userCont != -1)
            {
                cont=userCont;
                System.out.println("order complete!!");
                System.out.println();
            }
        }
        
        //display total 
        double orderTotal = s.sumTotal();
        System.out.printf("total price of groceries is %f ",orderTotal);
        System.out.println();
        
        //process payment
        System.out.print("enter payment amount : ");
        double userAmount = input.nextDouble();
        if(userAmount<orderTotal || userAmount!=orderTotal)
        {
           System.out.printf("the amount %f is invalid pleasse try again: ",userAmount); 
           System.out.print("enter payment amount : ");
           userAmount = input.nextDouble();
        }else  s.setChange(userAmount);
        
        double orderChange = s.getChange();
        System.out.printf("change : %f",orderChange);
        System.out.println();
    }
        
    
}
