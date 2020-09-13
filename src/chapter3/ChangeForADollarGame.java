package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String args[]){
        //Initialize what we know

        //Get what we won't know
        System.out.println("How many pennies would you like:");
        Scanner scanner = new Scanner(System.in);
        double pennies = scanner.nextDouble();

        System.out.println("How many nickles would you like:");
        double nickles = scanner.nextDouble();

        System.out.println("How many dimes would you like:");
        double dimes = scanner.nextDouble();

        System.out.println("How many quarters would you like:");
        double quarters = scanner.nextDouble();

        double changeTotal = (pennies*0.01) + (nickles*0.05) + (dimes*0.1) + (quarters*0.25);

        //Make decision

        if (changeTotal == 1){
            System.out.println("You won the game!");
        }
        else if (changeTotal < 1){
                double wentUnder= 1 - changeTotal;
                System.out.println("You went under " + wentUnder + " dollars");
            } else {
                    double wentOver= changeTotal - 1;
                    System.out.println("You went over " + wentOver + " dollars");
                    }
        }
}
