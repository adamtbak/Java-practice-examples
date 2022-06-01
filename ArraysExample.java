/*
 *  Class used to show different methods for working with Arrays. Methods include
 *  finding the largest element in an array, shuffling the contents of the array and
 *  shifting the contents of the array. Examples from Introduction to Java Programming 
 *  and Data Structures Comprehensive Version 12th Edition by Y. Daniel Liang
 */

public class ArraysExample 
{
    public static void main(String[] args)
    {
        int[] myArray = new int[50];
        initializeArray(myArray);
        
        System.out.println("Contents of entire array: ");
        System.out.println();
        printArray(myArray);        
        System.out.println();
        
        System.out.println("Largest Element: " + getLargestElement(myArray));         
        System.out.println();
        
        System.out.println("Contents of entire array (shuffled): ");
        shuffleArray(myArray);
        System.out.println();
        printArray(myArray);
        System.out.println();
        
        System.out.println("Contents of entire array (shifted): ");
        shiftArray(myArray);
        System.out.println();
        printArray(myArray);
    }
    
    // Initialize the array with random values between 0 and 100 (inclusive)
    private static void initializeArray(int[] inputArray)
    {
        for(int i = 0; i < inputArray.length; i++)
        {
            inputArray[i] = (int)(101 * Math.random());
        }
    }
    
    private static void printArray(int[] inputArray)
    {
        for(int i = 0; i < inputArray.length; i++)
        {
            if( (i % 10 == 0)&& (i != 0))        
                System.out.println();            
            if(i < inputArray.length - 1)
                System.out.print(inputArray[i] + " ");
            else
                System.out.println(inputArray[i]);
        }
    }
    
    private static int getLargestElement(int[] inputArray)
    {
        int largestElement = inputArray[0];
        for(int i = 0; i < inputArray.length; i++)
        {
            if(inputArray[i] > largestElement)
                largestElement = inputArray[i];
        }
        
        return largestElement;
    }
    
    private static void shuffleArray(int[] inputArray)
    {
        for(int i = 0; i < inputArray.length; i++)
        {
            // Generate an index j randomly
            int j = (int)(Math.random() * inputArray.length);
            
            // Swap inputArray[i] with inputArray[j]
            int temp = inputArray[i];
            inputArray[i] = inputArray[j];
            inputArray[j] = temp;
        }
    }
    
    private static void shiftArray(int[] inputArray)
    {
        int temp = inputArray[0];
        
        // Shift elements left
        for(int i = 1; i < inputArray.length; i++)
        {
            inputArray[i- 1] = inputArray[i];
        }
        
        inputArray[inputArray.length - 1] = temp;
    }
} // End class