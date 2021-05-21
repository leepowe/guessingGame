import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int guess;
        int randWinningNumber = rand.nextInt(10);
        int count = 3;
        int points;
        System.out.println("Welcome to Guessing Game!");
        if (randWinningNumber == 0) {
            randWinningNumber = 7;
        }
        do {
            System.out.println("\nPlease enter a number between 1 and 10: ");
            guess = input.nextInt();
            if (guess == 0) {
                System.out.println("\nInstructions: Attempt to guess the winning number. It must be between 1 and 10.");
            } else if (guess == randWinningNumber) {
                System.out.println("\nCongratulations! You win!");
                break;
            } else if (guess == -1) {
                break;
            } else if (guess >= 1 && guess <= 10) {
                System.out.println("\nSorry! That's not the right number. Try again!");
                if (guess > randWinningNumber) {
                    System.out.println("Hint: Winning number is less than " + guess + ".");
                } else
                    System.out.println("Hint: Winning number is greater than " + guess + ".");
            } else
                System.out.println("\nInvalid entry! Please use a number between 1 and 10.");
            if (guess != 0) {
                count--;
            }
        } while (count > 0);
        if (count == 3) {
            points = 100;
        } else if (count == 2) {
            points = 50;
        } else if (count == 1) {
            points = 25;
        } else
            points = 0;
        System.out.println("\nThanks for playing!");
        if (points == 100) {
            System.out.println("\nYou earned " + points + " points! :-D");
        } else if (points == 50) {
            System.out.println("\nYou earned " + points + " points! :-)");
        } else if (points == 25) {
            System.out.println("\nYou earned " + points + " points! :-]");
        } else
            System.out.println("\nYou earned " + points + " points! >:-(");
    }
}