import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExer5 {
	public static void main(String[] args) {
		int secretNumber = (int) (Math.random() * 49 + 1);
		int numoftries = 1;
		Scanner keyboard = new Scanner(System.in);
		int guess = 0;
		System.out.println("Guess a number from 1 to 50!");
		do {
			try {
				guess = keyboard.nextInt();
				if (guess < 1 || guess > 50)
					throw new OutOfRangeException();
				if (guess == secretNumber) {
					System.out.println("You got it in " + numoftries + " attempt(s)!");
					numoftries++;
				} else if (guess < secretNumber) {
					System.out.println("Too low. Try again.");
					numoftries++;
				} else if (guess > secretNumber) {
					System.out.println("Too high. Try again.");
					numoftries++;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Invalid input.");
				System.out.println("Guess a number from 1 to 50!");
				keyboard.next();
			} catch (OutOfRangeException oore) {
				System.out.println(oore.getMessage());
				System.out.println("Guess a number from 1 to 50!");
			}
		} while (guess != secretNumber);
	}
}

class OutOfRangeException extends Exception {
	public OutOfRangeException() {
		super("Out of range.");
	}
}