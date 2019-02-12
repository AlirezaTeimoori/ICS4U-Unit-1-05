
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
        ////System.out.println("FOR SCREENSHOTS: random is: " + randNum);

        // Asking for guess and storing data:
        System.out.println("OK, there is a random number generated between 1 to the number you enterd. \nCan you guess the number?");
        do {
            guess = input.nextInt(); // Gets a new guess from the user

            count = count + 1; // Adds one to count
            
            if (guess == randNum) { // Prints "That's right" if the numbers matched
                System.out.println("That's right! You guessed after " + count + " try(s)!");
            } else {System.out.println("Wrong! Try again... you can do it...");}
        } while (guess != randNum); // Goes over the do loop if the numbers don't match
        


	}
}
