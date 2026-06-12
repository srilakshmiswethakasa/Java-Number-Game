import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        String playAgain = "yes";

        System.out.println("=== NUMBER GUESSING GAME ===");

        while (playAgain.equalsIgnoreCase("yes")) {

            int number = rand.nextInt(100) + 1; // 1 to 100
            int attempts = 10;
            boolean guessed = false;

            System.out.println("\nI selected a number between 1 to 100");
            System.out.println("You have " + attempts + " attempts");

            while (attempts > 0) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("🎉 Correct! You won!");
                    totalScore += attempts * 10;
                    guessed = true;
                    break;
                } 
                else if (guess > number) {
                    System.out.println("📈 Too High!");
                } 
                else {
                    System.out.println("📉 Too Low!");
                }

                attempts--;
                System.out.println("Remaining attempts: " + attempts);
            }

            if (!guessed) {
                System.out.println("❌ You lost! Number was: " + number);
            }

            System.out.print("\nPlay again? (yes/no): ");
            playAgain = sc.next();
        }

        System.out.println("\n🏁 GAME OVER");
        System.out.println("Your Total Score: " + totalScore);

        sc.close();
    }
}