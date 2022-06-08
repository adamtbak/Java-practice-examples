/*
 * Class used to count the occurrence of each randomly generated character in the array. 
 * Example is Listing 7.4 from Introduction to Java Programming and Data Structures
 * Comprehensive Version 12th Edition by Y. Daniel Liangn the editor.
 */

package randomCharacter;

class CountLettersInArray 
{
    public static void main(String[] args)
    {
        // Declare and create an array
        char[] chars = createArray();
        
        // Display the array
        System.out.println("The lowercase letters are: ");
        displayArray(chars);
        
        // Count the occurence of each letter
        int[] counts = countLetters(chars);
        
        // Display counts
        System.out.println();
        System.out.println("The occurences of each letter are ");
        displayCounts(counts);
    } // End main
    
    /** Create an array of characters */
    private static char[] createArray()
    {
        // Declare an array of characters and create it
        char[] chars = new char[100];
        
        // Create lowercase letters randomly and assign
        // them to the array
        for(int i = 0; i < chars.length; i++)
        {
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        
        return chars;
    } // End createArray()

    /** Display the array of characters */
    private static void displayArray(char[] chars) 
    {
        // Display the characters in the array 20 on each line
        for(int i = 0; i < chars.length; i++)
        {
            if((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    } // End displayArray()

    /** Count the occurrence of each letter */
    private static int[] countLetters(char[] chars) 
    {
        // Declare and create an array of 26 int
        int[] counts = new int[26];
        
        // For each lowercase letter in the array, count it
        for(int i = 0; i < chars.length; i++)
        {
            counts[chars[i] - 'a']++;
        }
        
        return counts;
    } // End countLetters()

    private static void displayCounts(int[] counts) 
    {
        for(int i = 0; i < counts.length; i++)
        {
            if((i + 1) % 10 == 0)
                System.out.println((char)(i + 'a') + " : " + counts[i]);
            else
                System.out.print((char)(i + 'a') + " : " + counts[i] + "   ");
        }
    } // End displayCounts()
} // End class