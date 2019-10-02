/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searcharray;
import java.util.Scanner;
/**
 *
 * @author mlaba
 */
public class SearchArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] randomInt = new int[10];           //declare array
        int count=1;
        System.out.println("populate an array with 10 random integer values: ");
        for(int x=0; x<10; x++)
        {
            System.out.printf("value %d : ",count);
            randomInt[x]=input.nextInt();         //populate array
            count++;
        }
        
        TypesOfSearch s = new TypesOfSearch();
        s.selectionSort(randomInt);
        System.out.print("what word would you like to search for? the position of that word will be returned as an int value: ");
        int value = input.nextInt();
        int pos = s.binarySearch(randomInt,value);
        System.out.printf("the value %d is at position %d .", value , pos);
    }
    
}
