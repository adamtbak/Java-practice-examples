/*
 * Class used to simulate creating a deck a cards and choosing 4 random cards from
 * this deck. Example is Listing 7.2 from Introduction to Java Programming
 * and Data Structures Comprehensive Version 12th Edition by Y. Daniel Liang
 *
 */

public class DeckOfCards 
{
    public static void main(String[] args)
    {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        // Initialize the cards
        for(int i = 0; i < deck.length; i++)
        {
            deck[i] = i;
        }
        
        // Shuffle the cards
        for(int i = 0; i < deck.length; i++)
        {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        
        // Display the first four cards
        for(int i = 0; i < 4; i++)
        {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card Number " + deck[i] + ": " + rank + " of " + suit);
        }
    } // End main
} // End class