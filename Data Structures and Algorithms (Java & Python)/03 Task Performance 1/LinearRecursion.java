import java.util.Scanner;

public class LinearRecursion
{
	static int factorial(int n)
	{
		if (n == 0)
			return 1;
		else
			return(n * factorial(n-1));
	}
	public static void main(String[] args)
	{
		int factorial = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to compute the factorial: ");
		int number = input.nextInt();
		factorial = factorial (number);
		System.out.println("The factorial of " + number + " is " + factorial + ".");

	}
}