/*
 * Class used to find how many years it would take for a specified tuition to double
 * in price given the specified annual percentage increase. Example is Listing 5.10
 * from Introduction to Java Programming and Data Structures Comprehensive Version 
 * 12th Edition by Y. Daniel Liang
 *
 */
public class FutureTuition 
{
    public static void main(String[] args)
    {
        double currentTuition = 10000; // Tuition at year 0
        double targetTuition = 20000; // Doubling of originl tuition
        double percentageIncrease = 0.07;
        int year = 0;
        
        while(currentTuition < targetTuition)
        {
            currentTuition = currentTuition + (currentTuition * percentageIncrease);
            year++;
        }
        
        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be %.2f in %d years\n", currentTuition, year);
    }
}
