import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter the number of males: ");
    	int male = input.nextInt();
    	System.out.print("Enter the number of females: ");
    	int female = input.nextInt();
    	int total = male + female;
    	System.out.println("Number of students = " + total);
    	double malepercentage = male * 100;
    	double malepercentage2 = malepercentage / total;
    	String percent = "%";
    	System.out.printf("Male = %.2f%s", malepercentage2, percent);
    	System.out.println();
    	double femalepercentage = female * 100;
    	double femalepercentage2 = femalepercentage / total;
    	System.out.printf("Female = %.2f%s", femalepercentage2, percent);
    }
}
