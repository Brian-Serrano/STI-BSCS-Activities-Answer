import java.util.Scanner;
import java.util.Stack;

public class FruitBasket {
	public static void main(String[] args) {
		Stack<String> basket = new Stack<>();

		Scanner scan = new Scanner(System.in);

		String a = "Apple";
		String o = "Orange";
		String m = "Mango";
		String g = "Guava";
		char eats;

		System.out.println("Catch and eat any of these fruits:('apple', 'orange', 'mango', 'guava')");
		System.out.print("How many fruits would you like to catch? ");
		int fruits = scan.nextInt();
		System.out.println("Choose a fruit to catch. Press A, O, M or G.");

		int num;
		for (num = 1; num <= fruits; num++) {
			System.out.print("Fruit " + num + " of " + fruits + ":");
			char fruitnumber = scan.next().charAt(0);
			switch (fruitnumber) {
			case 'a':
				basket.push(a);
				break;
			case 'o':
				basket.push(o);
				break;
			case 'm':
				basket.push(m);
				break;
			case 'g':
				basket.push(g);
				break;
			}
		}
		System.out.println("Your basket now has :" + basket);
		System.out.print("Press E to eat Fruit : ");
		do {
			eats = scan.next().charAt(0);
			if (eats == 'e') {
				basket.pop();

				if (basket.isEmpty()) {
					System.out.println("No more Fruits.");
					break;
				}
			}
			System.out.println("Fruit(s) in the basket : " + basket);
			System.out.print("Press E to eat Fruit : ");
		} while (eats == 'e');
	}
}