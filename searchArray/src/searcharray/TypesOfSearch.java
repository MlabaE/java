/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searcharray;

/**
 *
 * @author mlaba
 */
public class TypesOfSearch {
    
    public static int linearSearch(String[] list, String key)       //linear search
    {
        for(int i=0; i<list.length ; i++)
        {
            if(key == list[i])
            {
                return i;
            }
        }
         return -1;
    }
    
    public static void selectionSort(int[] list)
    {
        for(int x=0; x<list.length; x++)
        {
            int currentMin = list[x];
            int currentMinIndex = x;
            
            for(int j=x+1; j<=list.length ; j++)
            {
                if(currentMin > list[j])
                {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != x)
            {
                list[currentMinIndex] = list[x];
                list[x]=list[currentMin];
            }
        }
    }
    
    public static int binarySearch(int[] list, int key)
    {
        int low = 0;
        int high = list.length-1;
        
        while(high>=low)
        {
            int mid = (low+high)/2;
            if(key < list[mid])
            {
                high=mid-1;
            }else if(key == list[mid])
            {
                return mid;
            }else
            {
                low = mid+1;
            }
        }
        return -low -1;
    }
    
}
