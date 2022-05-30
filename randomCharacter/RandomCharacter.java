/*
 * Class used to hold static helper methods used to find random characters. 
 * Example is Listing 6.10 from Introduction to Java Programming and Data Structures
 * Comprehensive Version 12th Edition by Y. Daniel Liangn the editor.
 */

package randomCharacter;

public class RandomCharacter 
{
    // Generate a random character between character1 and character2
    public static char getRandomCharacter(char character1, char character2)
    {
        return (char)(character1 + Math.random() * (character2 - character1 + 1));
    }
    
    // Generate a random lowercase letter
    public static char getRandomLowerCaseLetter()
    {
            return getRandomCharacter('a', 'z');
    }
    
    // Generate a random lowercase letter
    public static char getRandomUpperCaseLetter()
    {
            return getRandomCharacter('A', 'Z');
    }
    
    // Generate a random lowercase letter
    public static char getRandomDigitCharacter()
    {
            return getRandomCharacter('0', '9');
    }
    
    // Generate a random lowercase letter
    public static char getRandomCharacter()
    {
            return getRandomCharacter('\u0000', '\uFFFF');
    }
}
