import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int answer = new Random().nextInt(1, 100);
        int numOfTries = 8;
        boolean win = false;

        while (!win) {

            System.out.println("Guess a number between 1 and 100: ");
            int guess = input.nextInt();
            numOfTries--;
            if (numOfTries > 0) {
                if (guess == answer) {
                    System.out.printf("Your guess of %d is correct!", guess);
                    win = true;
                } else if (guess < answer) {
                    System.out.printf("Your guess of %d is too low%n", guess);
                    System.out.printf("You have %d guesses left%n", numOfTries);
                } else {
                    System.out.printf("Your guess of %d is too high%n", guess);
                    System.out.printf("You have %d guesses left%n", numOfTries);
                }
            } else {
                win = true;
                System.out.println("You lose");

            }
                        }

    }
}
