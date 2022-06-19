/*
 * Class used to practice working with two dimensional arrays. 
 * Examples included filling the contents of the array with random values 
 * and randomly shuffling the array. Example is from Section 8.3 from
 * Introduction to Java Programming and Data Structures Comprehensive 
 * Version 12th Edition by Y. Daniel Liang.
 */

import java.util.Scanner;

public class TwoDimensionalArray 
{
    public static void main(String[] args)
    {        
        int[][] matrix = new int[2][3];
        
        // Fill array with random values
        fillArrayRandomValues(matrix);
        
        System.out.println("Array filled with random values: ");
        printArray(matrix);
        
        // Randomly shuffle contents of array
        randomShuffleArray(matrix);
        
        System.out.println("\nArray randomly shuffled:");
        printArray(matrix);
        
    } // End main
    
    private static void printArray(int[][] inputArray)
    {
        for(int row = 0; row < inputArray.length; row++)
        {
            for(int column = 0; column < inputArray[row].length; column++)
            {
                System.out.print(inputArray[row][column] + " ");               
            }
            
            System.out.println();
            
        } // End for
    } // End printArray
    
    private static void fillArrayUserInput(int[][] inputArray)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + inputArray.length + " rows and " + inputArray[0].length + " columns: ");
        for(int row = 0; row < inputArray.length; row++)
        {
            for(int column = 0; column < inputArray[row].length; column++)
            {
                System.out.print("[" + row + "]" + "[" + column + "]: ");
                inputArray[row][column] = input.nextInt();
            }
        }        
    } // End fillArrayUserInput
    
    private static void fillArrayRandomValues(int[][] inputArray)
    {        
        for(int row = 0; row < inputArray.length; row++)
        {
            for(int column = 0; column < inputArray[row].length; column++)
            {
                inputArray[row][column] = (int)(Math.random() * 100);
            }
        }        
    } // End fillArrayRandomValues
    
    private static void randomShuffleArray(int[][] inputArray)
    {
        for(int row = 0; row < inputArray.length; row++)
        {
            for(int column = 0; column < inputArray[row].length; column++)
            {
                int randomRow = (int)(Math.random() * inputArray.length);
                int randomColumn = (int)(Math.random() * inputArray[randomRow].length);
                
                // Swap inputArray[row][column] with inputArray[randomRow][randomColumn]
                int temp = inputArray[row][column];
                inputArray[row][column] = inputArray[randomRow][randomColumn];
                inputArray[randomRow][randomColumn] = temp;
            }
        }        
    } // End randomShuffleArray    
} // End class