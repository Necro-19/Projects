package tasks;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		Random random = new Random();

		int playerScore = 0;
		int computerScore = 0;

		while (true)
		{
			System.out.println("Make your move (rock, paper, scissors): ");
			String playerMove = scanner.nextLine().toLowerCase();
			if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors"))
			{
				System.out.println("Invalid move! Please try again.");
				continue;
			}


			String[] options = {"rock", "paper", "scissors"};
			String computerMove=options [random.nextInt (options.length)];

			System.out.println("Computer played: "+computerMove);

			if (playerMove.equals (computerMove))
			{
				System.out.println("It's a tie!");
			} else if (playerMove.equals("rock") && computerMove.equals("scissors") ||
					playerMove.equals("paper") && computerMove.equals("rock") ||
					playerMove.equals("scissors") && computerMove.equals("paper"))
			{
				playerScore++;
				System.out.println("You win! Score: " + playerScore + "_" + computerScore);
			} else {
				computerScore++;
				System.out.println("You lose! Score: " + playerScore + "_" + computerScore);
			}
		System.out.println("Play again? (y/n)");
		String answer = scanner.nextLine().toLowerCase();
		if (!answer.equals("y"))
		{
			break;
		}
	}

	scanner.close();
	System.out.println("Arigato Gozaimasu...");
	}
}