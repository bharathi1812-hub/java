package spring;
import java.util.*;

public class Boot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.print("Enter min number: ");
        int min = Integer.parseInt(scanner.nextLine()); 
        int max = Integer.parseInt(scanner.nextLine()); 

        int numberToGuess = random.nextInt(max - min + 1) + min;
        int guessCount = 0;
        int userGuess = -1;

        System.out.println("Guess a number between " + min + " and " + max + ".");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            String input = scanner.nextLine();

            if (!input.matches("\\d+")) {
                System.out.println(" Invalid input. Please enter a valid integer.");
                continue;
            }

            userGuess = Integer.parseInt(input);

            if (userGuess < min || userGuess > max) {
                System.out.println(" Please enter a number between " + min + " and " + max + ".");
                continue;
            }

            guessCount++;

            if (userGuess < numberToGuess) {
                System.out.println(" Too low. Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println(" Too high. Try again.");
            } else {
                System.out.println(" 🎉 Correct! You found the number in " + guessCount + " attempts.");
            }
        }

        scanner.close();
    }
}