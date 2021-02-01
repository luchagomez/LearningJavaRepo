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

        Random random = new Random();

        for (int i= 0; i< LENGTH; i++){
            int randomNumber;

            /* we added a do-while loop to not add duplicated numbers to the lottery ticket. With the search
            method, we'll loop in the array (ticket) to check if the random number was already added to the
            ticket list, if we find the number search will return TRUE (meaning it was already added).
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

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search (int[] array, int numberToSearchFor){

        // this is called an enhanced loop.
        // It iterates through array and each time assigns the current element to 'value¡
        for (int value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        //If we've reached this point, then the entire array was searched and the value was not found
        return false;
    }

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
