package chapter7;

import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    // variable name in all caps is a constant (convention), is a field that doesn't change
    // with the keyword 'final' this variable will not change
    public static void main(String [] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }
    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i= 0; i< LENGTH; i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
            // picking nextInt(int bound) we can define the bound where the random number is between 0 and the number in parenthesis
            // in this case, we defined the MAX_TICKET_NUMBER.
            // We added the +1 because the random creates a number between 0 and the bound defined
        }

        return ticket;
    }

    public static void printTicket (int ticket[]){
        for (int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
