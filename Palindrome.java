/*
 * Class used to check if a given string is a Palindrome.
 * Example is Listing 5.14 from Introduction to Java Programming and Data Structures
 * Comprehensive Version 12th Edition by Y. Daniel Liang
 *
 */

import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args)
    {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a String
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        
        // The index of the first character in the string
        int low = 0;
        
        // The index of the last character in the string
        int high = s.length() - 1;
        
        boolean isPalindrome = true;
        while(low < high)
        {
            if(s.charAt(low) != s.charAt(high))
            {
                isPalindrome = false;
                break;
            }
            
            low++;
            high--;
        }
        
        if(isPalindrome)        
            System.out.println(s + " is a palindrome");        
        else
            System.out.println(s + " is not a palindrome");
    }
}