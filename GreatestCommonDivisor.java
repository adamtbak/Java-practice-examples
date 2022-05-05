/*
    Class used to find the Greatest Common Divisor between two integers.
    Example is Listing 5.9 from Introduction to Java Programming and Data Structures
    Comprehensive Version 12th Edition by Y. Daniel Liang
*/

import java.util.Scanner;

public class GreatestCommonDivisor 
{
    /** Main Method */
    public static void main(String args[])
    {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int firstInteger = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int secondInteger = input.nextInt();
        
        int greatestCommonDivisor = 1; // Initial GCD is 1
        int numberToCheck = 2;
        
        while((numberToCheck <= firstInteger) && (numberToCheck <= secondInteger))
        {
            if((firstInteger % numberToCheck == 0) && (secondInteger % numberToCheck == 0))
            {
                greatestCommonDivisor = numberToCheck;
            }
            
            numberToCheck++;
        }
        
        System.out.println("The greatest commond divisor for " + firstInteger +
                " and " + secondInteger + " is: " + greatestCommonDivisor);
    } // End Main    
} // End Class