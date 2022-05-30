/*
 * Class used to test the methods in the RandomCharacter class. 
 * Example is Listing 6.11 from Introduction to Java Programming and Data Structures
 * Comprehensive Version 12th Edition by Y. Daniel Liangn the editor.
 */

package randomCharacter;

public class TestRandomCharacter
{
    public static void main(String args[])
    {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;
        
        // Print random characters between 'a' and 'z', 25 characters per line
        for(int i = 0; i < NUMBER_OF_CHARS; i++)
        {
            char randomCharacter = RandomCharacter.getRandomLowerCaseLetter();
            if((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(randomCharacter);
            else
                System.out.print(randomCharacter);
        } // End for-loop         
    } // End main
} // End class
