/*
 * Class used to implement linear search and binary search. 
 * Example is Listing 7.7 from Introduction to Java Programming and Data Structures
 * Comprehensive Version 12th Edition by Y. Daniel Liang.
 */

public class Search 
{
    public static void main(String[] args)
    {
        int[] list = {1, 4, 4, 3, 5, -3, 6, 2};
        int[] orderedList = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("linear search for 4: " + linearSearch(list, 4));
        System.out.println("linear search for -4: " + linearSearch(list, -4));
        System.out.println("linear search for -3: " + linearSearch(list, -3));
        System.out.println("binary search for 2: " + binarySearch(orderedList, 2));
        System.out.println("binary search for 11: " + binarySearch(orderedList, 11));
        System.out.println("binary search for 12: " + binarySearch(orderedList, 12));
        System.out.println("binary search for 1: " + binarySearch(orderedList, 1));
        System.out.println("binary search for 3: " + binarySearch(orderedList, 3));
    }
    
    public static int linearSearch(int[] list, int key)
    {
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] == key)
                return i;
        }
        
        return -1;
    }
    
    /* Use binary search to find the key in the list */
    public static int binarySearch(int[] list, int key)
    {
        int low = 0;
        int high = list.length - 1;
        
        while(high >= low)
        {
            int mid = (low + high) / 2;
            if(key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        
        return -low - 1;
    } // End binarySearch()
} // End class