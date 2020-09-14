package chapter4;

import java.util.Scanner;

/*
 * FOR LOOP: We can't control it.
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier {
    public static void main(String args[]){

        //Get the number of items to scan
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;
        int itemNumber= 1;

        //Create loop to iterate through all of the items and accumulate the costs
        for(int i=0; i<quantity; i++){

            System.out.println("Enter the cost of the item " + itemNumber + ":");
            double price = scanner.nextDouble();
            total += price;
            itemNumber += 1;
        }
        scanner.close();

        System.out.printf("Your total is $%s%n", total);
    }
}
