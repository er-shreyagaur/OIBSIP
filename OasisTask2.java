import java.util.*;

public class OasisTask2 {
        private static final int MIN_RANGE = 1;
        private static final int MAX_RANGE = 100;
        private static final int MAX_ATTEMPTS = 5;
        private static final int MAX_ROUNDS = 3;

        public static void main(String[] args) {
                Random random = new Random();
                Scanner sc = new Scanner(System.in);
                int totalScore = 0;

                System.out.println("Welcome to the Number Guessing Game!");
                System.out.println("Total Number Of Rounds: 3");
                System.out.println("Attempts To Guess Number in Each Round: 5\n");

                for (int x = 1; x <= MAX_ROUNDS; x++) {
                        int targetNumber = random.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE;
                        int attempts = 0;
                        boolean guessedCorrectly = false;

                        System.out.println("Round " + x + " begins! Guess the number between " + MIN_RANGE + " and " + MAX_RANGE);

                        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
                                System.out.print("Attempt " + attempt + ": Enter your guess: ");
                                int userGuess = sc.nextInt();
                                attempts++;

                                if (userGuess == targetNumber) {
                                        System.out.println("Congratulations! You guessed the number correctly.");
                                        totalScore += 10;
                                        guessedCorrectly = true;
                                        break;
                                } else if (userGuess < targetNumber) {
                                        System.out.println("The number is higher than your guess.");
                                } else {
                                        System.out.println("The number is lower than your guess.");
                                }
                        }

                        if (attempts == MAX_ATTEMPTS) {
                                System.out.println("Sorry! You've used all attempts. The correct number was " + targetNumber);
                        }

                        System.out.println("Total Score after round " + x + ": " + totalScore + "\n");
                }

                System.out.println("Game Over! Your final score is: " + totalScore);
                sc.close();
        }
}
