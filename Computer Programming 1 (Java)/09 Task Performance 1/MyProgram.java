import java.util.Scanner;
public class MyProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter three first names:");
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String name3 = input.nextLine();
        System.out.println ("Possible names are:");
        System.out.println ("1 - " + name1.concat(" " + name2));
        System.out.println ("2 - " + name1.concat(" " + name3));
        System.out.println ("3 - " + name2.concat(" " + name1));
        System.out.println ("4 - " + name2.concat(" " + name3));
        System.out.println ("5 - " + name3.concat(" " + name1));
        System.out.println ("6 - " + name3.concat(" " + name2));
        System.out.print ("Enter 1-6 to select a name: ");
        int num1 = input.nextInt();
        switch (num1) {

        	case 1:
        		System.out.println ("The initials for " + name1.concat(" " + name2) + " is " + name1.charAt(0) + name2.charAt(0) + ".");
        		System.out.println ("Suggested username: " + name1.toLowerCase() + "_" + name2.toLowerCase());
        		break;
        	case 2:
        		System.out.println ("The initials for " + name1.concat(" " + name3) + " is " + name1.charAt(0) + name3.charAt(0) + ".");
        		System.out.println ("Suggested username: " + name1.toLowerCase() + "_" + name3.toLowerCase());
        		break;
        	case 3:
        		System.out.println ("The initials for " + name2.concat(" " + name1) + " is " + name2.charAt(0) + name1.charAt(0) + ".");
        		System.out.println ("Suggested username: " + name2.toLowerCase() + "_" + name1.toLowerCase());
        		break;
        	case 4:
        		System.out.println ("The initials for " + name2.concat(" " + name3) + " is " + name2.charAt(0) + name3.charAt(0) + ".");
        		System.out.println ("Suggested username: " + name2.toLowerCase() + "_" + name3.toLowerCase());
        		break;
        	case 5:
        		System.out.println ("The initials for " + name3.concat(" " + name1) + " is " + name3.charAt(0) + name1.charAt(0) + ".");
        		System.out.println ("Suggested username: " + name3.toLowerCase() + "_" + name1.toLowerCase());
        		break;
        	case 6:
        		System.out.println ("The initials for " + name3.concat(" " + name2) + " is " + name3.charAt(0) + name2.charAt(0) + ".");
        		System.out.println ("Suggested username: " + name3.toLowerCase() + "_" + name2.toLowerCase());
        		break;
        	default:
        		System.out.println ("error");
        }
    }
}
