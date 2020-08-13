package chapter2;

import java.awt.*;
import java.util.Scanner;

public class Exercise1 {
    public static void main (String arg []) {
        //1. Ask for a season of the year
        System.out.println("Enter any season of the year.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Ask for a whole number
        System.out.println("Enter a whole number.");
        int number = scanner.nextInt();

        //3. Ask for an adjective
        System.out.println("Enter an adjective.");
        String adjective = scanner.next();
        scanner.close();

        //4. Print the sentence
        System.out.println("On a " + adjective + " "+ season + " day, I drink a minimum of " + number + " cups of coffee");
    }

}
