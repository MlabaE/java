/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexadecimaltodecimal;
 import java.util.Scanner;
 import java.lang.Math;
/**
 *
 * @author mlaba
 */
public class HexadecimalToDecimal {

    
    public static void main(String[] args) {
       
        
        Scanner input = new Scanner(System.in);
        String hexStr=" ";
        int val=0 , count=0;
        double tempsum=0.0, sum=0.0;
        
        System.out.print("please enter hexadecimal value: ");
        hexStr=input.nextLine();
        
        int slen = hexStr.length()+1;
        
        for(int s=1; s<slen; s++)
        {
             
              val=getPos(hexStr.charAt(count));
              tempsum =val*(Math.pow(16,count));
              sum+=tempsum;
              
              s++;
              count++;
              tempsum=0;
              val=0;
        }
          
        System.out.printf("hexa %s to decimal is : %f ",hexStr, sum);
           
    }

    public static int getPos(char val)
    {
        char [] hex ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int pos = 0;
        for(int i=0; i<hex.length; i++)
        {
            if(hex[i]==val)
            {
                pos = i;
            }
        }
        
        return pos;
    }
    
}
