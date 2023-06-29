import java.util.*;

public class SeatReservation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[][] seat = new String[10][4];
		for(int i=0; i<10; i++) {
			for(int j=0; j<4; j++) {
				seat[i][j] = "*";
			}
		}
		while(true) {
			System.out.println("Bus Seat Reservation:");
			System.out.println("\tCol 1\tCol 2\tCol 3\tCol 4");
			for(int i=0; i<10; i++) {
				System.out.print("Row " + (i+1));
				for(int j=0; j<4; j++) {
					System.out.print("\t" + seat[i][j]);
				}
				System.out.print("\n");
			}
			System.out.print("Enter row and column number to reserve separated by space (Enter a negative answer to exit): ");
			int seat2 = s.nextInt();
			if(seat2 >= 0) {
				int seat3 = s.nextInt();
				seat[seat2-1][seat3-1] = "X";
				continue;
			} else {
				System.out.println("Program Exit!");
				break;
			}
		}
	}
}
