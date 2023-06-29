import java.util.Scanner;
public class GrossPayCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = input.nextLine();
        System.out.print("Press F for Full Time or P for Part Time: ");
        char time = input.next().charAt(0);
        switch (time)
        {
        	case 'P':
        		System.out.println("--- Part Time Employee ---");
        		System.out.print("Enter rate per hour: ");
        		double rate = input.nextDouble();
        		System.out.print("Enter no. of hours worked: ");
        		int work = input.nextInt();
        		System.out.print("Enter no. of overtime: ");
        		int overtime = input.nextInt();
        		System.out.println("___________________________________");
        		System.out.println("Employee Name:    " + name);
        		double basic_pay = rate * work;
        		System.out.println("Basic Pay:        " + basic_pay);
        		double overtime_pay1 = rate * 1.25;
        		double overtime_pay2 = overtime_pay1 * overtime;
        		System.out.println("Overtime Pay:     " + overtime_pay2);
        		System.out.println("___________________________________");
        		double gross_pay = basic_pay + overtime_pay2;
        		System.out.println("Gross Pay:        " + gross_pay);
        		break;

        	case 'F':
        		System.out.println("--- Full Time Employee ---");
        		System.out.print("Enter Basic Pay: ");
        		double pay = input.nextDouble();
        		System.out.println("___________________________________");
        		System.out.println("Employee Name:    " + name);
        		System.out.println("Basic Pay:        " + pay);
        		System.out.println("___________________________________");
        		double grosspay = pay;
        		System.out.println("Gross Pay:        " + grosspay);
        		break;

        	default:
        		System.out.println("Invalid letter");
        }
    }
}
