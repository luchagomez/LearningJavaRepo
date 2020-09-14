package chapter5;

/*
 * METHODS are used to solve complex problems. In other languages they are known as functions.
 * The header of a method contains the following parts:
 * - the access modifier (public, private, etc)
 * - the return type (always required, if the method returns nothing the type should be void)
 * - the name of the method and the parameter list. This is the signature of the method and must be unique
 * After the header, we have the body.
 */

import java.util.Scanner;

public class Greetings {
    public static void main(String args[]){

        System.out.println("Enter your name:");
        Scanner scanner= new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }

    public static void greetUser(String name) {
        System.out.println("Hi there, " + name);
    }
}
