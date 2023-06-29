import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class MovieTime {
	public static void main(String[] args) {
		Queue<String> movies = new LinkedList<>();
		Queue<String> snacks = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		
		String movie;
		for(int i=0; i<3; i++) {
			System.out.print("Enter movie " + (i+1) + " of 3: ");
			movie = scan.nextLine();
			movies.add(movie);
		}
		String snack;
		for(int i=0; i<3; i++) {
			System.out.print("Enter snack " + (i+1) + " of 3: ");
			snack = scan.nextLine();
			snacks.add(snack);
		}

		System.out.println("Movies to watch are: deque(" + movies + ")");
		System.out.println("Snacks available are: deque(" + snacks + ")");

		System.out.println("Press S each time you finish a snack.");

		char finish;

		do {
			finish = scan.next().charAt(0);
			if (finish == 's') {
				snacks.remove();

				if (snacks.isEmpty()) {
					System.out.println("No more snacks.");
					break;
				}
			}
			System.out.println("deque(" + snacks + ")");
		} while (finish == 's');
	}
}