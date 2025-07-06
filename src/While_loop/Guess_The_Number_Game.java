package While_loop;

import java.util.Scanner;
import java.util.Random;

public class Guess_The_Number_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1; // Random number between 1 and 100
        int guess = 0;

        System.out.println("Guess the number (between 1 and 100):");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed the number!");
            }
        }

        scanner.close();
    }
}

