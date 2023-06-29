import java.util.Scanner;
import java.util.PriorityQueue;

public class Greeting
{
	public static void main(String[] args)
	{
		PriorityQueue<String> nicknames = new PriorityQueue<>();
		Scanner name = new Scanner(System.in);
		char hi;
		System.out.println("Enter the nicknames of 4 of your classmates:");
		for(int i=0; i<4; i++) {
			String nickname = name.nextLine();
			nicknames.add(nickname);
		}
		System.out.print("Press H to say Hi to each of them. ");
		do
		{
			hi = name.next().charAt(0);
			if(hi == 'h')
			{
				System.out.println("Hi " + nicknames.remove());

				if(nicknames.isEmpty())
				{
					System.out.println("Done saying Hi");
					break;
				}
			}
		}
		while(hi == 'h');
	}
}