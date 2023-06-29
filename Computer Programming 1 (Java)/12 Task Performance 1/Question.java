import java.util.*;

public class Question {

	public static void main(String[] args) {
		System.out.println("Choose the letter of the correct answer.");
		items(0, 0);

	}

	public static void items(int num, int i) {
		Scanner s = new Scanner(System.in);
		String[][] quiz = {
				{"1. What is the strongest type of tool in minecraft?", "a. diamond", "b. iron", "c. netherite", "c"},
				{"2. What is the hardest online level in geometry dash?", "a. BloodLust", "b. BloodBath", "c. Blade of Justice", "a"},
				{"3. What is the hardest main level in geometry dash?", "a. Clubstep", "b. Fingerdash", "c. Deadlocked", "c"},
				{"4. What are the strongest dragons in dragon city?", "a. High Earthen, High Scorchwing, High Devastation", "b. High Nebula, High Arcane, High Occult Titan", "c. High Overlord, High Fallen, High Superstition", "b"},
				{"5. Which of this describes a zombie in minecraft?", "a. Hostile Mob", "b. Neutral Mob", "c. Passive Mob", "a"}
		};
		if (num == 5) {
			System.out.println("Congratulations, your score is: " + i);
		} else {
			for(int j=0; j<4; j++) {
				System.out.println(quiz[num][j]);
			}
			String answer = s.nextLine();
			if(answer.equalsIgnoreCase(quiz[num][4])) {
				i++;
			}
			items(num + 1, i);
		}
	}
}
