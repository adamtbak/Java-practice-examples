/*
 * Class used to implement selectionSort.  Example is Listing 7.8 from
 * Introduction to Java Programming and Data Structures Comprehensive 
 * Version 12th Edition by Y. Daniel Liang.
 */

public class Sort 
{
    public static void main(String[] args)
    {
        int[] arrayToSort = {5, 2, 8, 9, 2, 10, 12, 3, 1, 2};
        printArray(arrayToSort);
        selectionSort(arrayToSort);
        System.out.println();
        printArray(arrayToSort);        
    }
    
    private static void selectionSort(int[] array)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            int minimum = array[i];
            int minimumIndex = i;
            
            for(int j = i + 1; j < array.length; j++)
            {                
                if(array[j] < minimum)
                {
                    minimum = array[j];  
                    minimumIndex = j;
                }                    
            }
            
            if(minimumIndex != i)
            {
                int temp = array[i];
                array[i] = minimum;
                array[minimumIndex] = temp;
            } // End if          
        } // End for
    } // End selectionSort

    private static void printArray(int[] arrayToSort) 
    {
        for(int i = 0; i < arrayToSort.length; i++)
        {
            System.out.print(arrayToSort[i] + " ");
        }
    }
} // End class