/*
 * Class used to convert a Hexadecimal number into a Decimal number.
 * Example is Listing 6.8 from Introduction to Java Programming and Data Structures
 * Comprehensive Version 12th Edition by Y. Daniel Liang
 *
 */

import java.util.Scanner;

public class Hex2Decimal 
{
    public static void main(String[] args)
    {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a hexadecimal integer
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        
        System.out.println("The decimal value for a hexadecimal number " + hex +
                " is " + hexToDecimal(hex.toUpperCase()));
    } // End of main
    
    public static int hexToDecimal(String hex)
    {
        int decimalValue = 0;
        for(int i = 0; i < hex.length(); i++)
        {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    } // End of hexToDecimal

    public static int hexCharToDecimal(char hexChar)
    {
        if(hexChar >= 'A' && hexChar <= 'F')
            return 10 + hexChar - 'A';
        else // hexChar is '0', '1', '2',... or '9'
            return hexChar - '0';
    } // End of hexCharToDecimal
} // End of class