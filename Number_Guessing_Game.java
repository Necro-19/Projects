package tasks;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {

	public static void main(String[] args)
	{
		Random random= new Random();
		int numberToGuess = random.nextInt (100) + 1;

		Scanner scanner = new Scanner (System.in);

		int numberOfGuesses = 0;
		System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
		while (true)
		{
			numberOfGuesses++;
			System.out.print ("Enter your guess: ");
			int guess = scanner.nextInt ();

			if (guess == numberToGuess)
			{
				System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses.");
				break;
			}
			else if (guess < numberToGuess) {
				System.out.println("Too low! Try again.");
			}
			else
			{
				System.out.println("Too high! Try again.");
			}
		}

	}

}

