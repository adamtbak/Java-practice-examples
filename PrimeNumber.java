/*
 * Class used to generate the first 50 prime numbers.
 * Example is Listing 6.7 from Introduction to Java Programming and Data Structures
 * Comprehensive Version 12th Edition by Y. Daniel Liang
 *
 */

public class PrimeNumber
{
    public static void main(String[] args)
    {
        System.out.println("The first 50 prime numbers are: \n");
        printPrimeNumber(50);
    } // End of main
    
    public static void printPrimeNumber(int numberOfPrimes)
    {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        // Repeatedly find prime numbers
        while(count < numberOfPrimes)
        {
            // Display the prime number and increase the count
            if(isPrime(number))
            {
                count++; // Increase the count;
                
                if(count % NUMBER_OF_PRIMES_PER_LINE == 0)
                {
                    // Display the number and advance to the new line
                    System.out.println(number);
                }
                else
                {
                    System.out.print(number + " ");
                }              
            }
            
            // Check if the next number is prime
            number++;
        } // End of while loop
    } // End of printPrimeNumber
    
    // Check whether number is prime
    public static boolean isPrime(int number)
    {          
        for(int divisor = 2; divisor <= number / 2; divisor++)
        {
            if(number % divisor == 0)
            {
                return false;                   
            }
        }

        return true;
    }
} // End of class
