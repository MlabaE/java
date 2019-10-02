/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandarray;

/**
 *
 * @author mlaba
 */
public class stack {
    
    int[] myList = new int[5];
    int top ;
    
    stack() 
    { 
        top = -1; 
    } 
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    
    //Adds an item in the stack
    boolean push(int x) 
    { 
        if (top >= (4)) 
        { 
            System.out.println("stack is full"); 
            return false; 
        } 
        else
        { 
            myList[++top] = x; 
            System.out.println(x + " : pushed into stack"); 
            return true; 
        } 
    }
    
    //Removes an item from the stack
    int pop() 
    { 
        if (top < 0) 
        { 
            System.out.println("can not pop empty array"); 
            return 0; 
        } 
        else
        { 
            int x = myList[top--]; 
            return x; 
        } 
    } 
    
    
    
}

