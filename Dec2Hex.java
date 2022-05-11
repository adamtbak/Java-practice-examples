/*
 * Class used to convert a Decimal number into a Hexadecimal number.
 * Example is Listing 5.11 from Introduction to Java Programming and Data Structures
 * Comprehensive Version 12th Edition by Y. Daniel Liang
 *
 */

import java.util.Scanner;

public class Dec2Hex 
{
    public static void main(String[] args)
    {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a decimal integer
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        
        // Convert decimal to hex
        String hex = "";
        
        while(decimal != 0)
        {
            int hexValue = decimal % 16;
            
            // Convert a decimal value to a hex digit
            char hexDigit = (0 <= hexValue && hexValue <= 9) ?
                    (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
            
            hex = hexDigit + hex;
            decimal = decimal / 16;
        }
        
        System.out.println("The hex number is " + hex);
    }
}