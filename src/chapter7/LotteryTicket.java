package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    // variable name in all caps is a constant (convention), is a field that doesn't change
    // with the keyword 'final' this variable will not change

    public static void main(String [] args) {
        int ticket[] = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){

        int ticket[] = new int[LENGTH];
        // Random is a class of the java util, this class generates a random number
        Random random = new Random();

        // with the loop for we assign a random number to our ticket variable
        for (int i= 0; i< LENGTH; i++){
            int randomNumber;

            /* To avoid duplicated numbers to be added to the ticket array, we use the do-while loop.
            We generate random numbers, and do a sequential search in the array to check the random number was not
            was already added to it. If we find the number search will return TRUE (meaning it was already added).
            If FALSE, we'll add the random number.*/

            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));

            ticket[i] = randomNumber;

            // picking nextInt(int bound) we can define the bound where the random number is between 0
            // and the number in parenthesis
            // in this case, we defined the MAX_TICKET_NUMBER.
            // We added the +1 because the random creates a number between 0 and the bound defined

        }

        return ticket;
    }
/*
Sequential Search
 The sequential search algorithm searches every element in the array until it finds the value
 that it's looking for. Or, until it arrives at the end of the array.
 This algorithm is okay for small arrays but it's inefficient for arrays with more than several thousand elements.
 */
    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search (int[] array, int numberToSearchFor){

        // this is called an enhanced loop.
        // It iterates through "array" and each time assigns the current element to "value"¡
        for (int value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        //If we've reached this point, then the entire array was searched
        // and the value was not found
        return false;
    }
/*
Binary Search
For the binary search the array must first be sorted.
So, in the case of our lottery ticket array, the elements would need to be in ascending order
from least to greatest.
Then you will write code that will begin the search, by checking the element in the middle of
the array, to see if it's equal, greater than, or less than the value that you're searching for.

If it's greater than, then there's no need to search the entire second half of the array.
Because we know, that everything over there will be greater than as well.
And the element you're searching for is definitely not over there.
Likewise, if the middle number is less than the value you're searching for,
then there's no need to search the entire first half of the array.

And if the value is equal, you're lucky and you're done.
If it's not equal you've still eliminated half of the array where you know the value is not,
and then you continue with another iteration.

Each iteration continues like this — eliminating half of the array for what needs to be searched,
until you find the value, or you search the entire array.

This is a much quicker approach than the sequential search.
 */
    public static boolean binarySearch (int[] array, int numberToSearchFor){
        //Array must be sorted first
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        // we do an if because the binarySearch returns a value greater or equal to 0 if
        // and only if the key is found
        if(index >= 0){
            return true;
        }
        else return false;
    }
    public static void printTicket (int ticket[]){
        for (int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
