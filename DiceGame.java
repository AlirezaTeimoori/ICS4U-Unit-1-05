
//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Feb 11 2019        --
//-- Created for:    Unit 1-05         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------

// Importing Scanner
import java.util.Random;
import java.util.Scanner;


public class DiceGame {

    public static Scanner input;
    public static Random random = new Random();
    public static int guess;
    public static int count = 0;
	public static void main (String[]args) {
        // Asking for range end and storing data:
        System.out.println("Hello, and welcome to the DiceGame!!! \nPlease Enter the number you want to generate the random number between (starts with 1): \n");
        input = new Scanner(System.in);
        int range = input.nextInt();
        
        // Generates the random number between the range:
        int randNum = random.nextInt(range);
        System.out.println(randNum);

        // Asking for guess and storing data:
        System.out.println("OK, there is a random number generated between 1 to the number you enterd. \nCan you guess the number?");
        do {
            guess = input.nextInt();
            count = count + 1;
            if (guess == randNum) {
                System.out.println("That's right! You guessed after " + count + " tries!");
            }
        } while (guess != randNum);
        


	}
}
