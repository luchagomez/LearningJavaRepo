package chapter4;

import java.util.Random;

public class RollTheDieGame {

public static void main(String args[]){
    int finalSpace= 20;
    int maxRolls= 5;
    int currentSpace = 0;
    Random random= new Random();

    System.out.println("Welcome to Roll the Die Game! Let's start playing...");

    for (int i=1; i<=maxRolls; i++){
        int dieValue = random.nextInt(6) +1;
        currentSpace += dieValue;

        System.out.println("You have rolled a " + dieValue);

        if (currentSpace == finalSpace){
            System.out.println("You are on " + currentSpace + " YOU WIN! CONGRATS!");
            break;
        }
        else if(currentSpace > finalSpace){
            System.out.println("You have past the last space, sorry. YOU LOSE!");
            break;
        }
        else if(currentSpace < finalSpace && i== maxRolls){
            System.out.println("You are on space" + currentSpace);
            System.out.println("You are out of rolls, you didn't make it to all " + finalSpace + " spaces. YOU LOSE!");
        }
        else {
            int spacesToGo= finalSpace - currentSpace;
            System.out.println("You are on space " + currentSpace + " and have " + spacesToGo + " more to go");
        }

    }
}

}
