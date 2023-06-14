package conditionalStatements;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("To find the prices of the below objects enter the option number corresponding to it");
		System.out.println("Option no \t Cost" );
		System.out.println("1. \t\t Papaya");
		System.out.println("2. \t\t Mangoes");
		System.out.println("3. \t\t Banana");
		System.out.println("4. \t\t Grapes");
		System.out.println("5. \t\t Water Melon");
		System.out.println("Enter the option:");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Rs.30 per KG");
			break;
		case 2:
			System.out.println("Rs.50 per KG");
			break;
		case 3:
			System.out.println("Rs.60 per dozen");
			break;
		case 4:
			System.out.println("Rs.80 per KG");
			break;
		case 5:
			System.out.println("Rs.25 per KG");
			break;
		default:
			System.out.println("Please enter a valid option");
		}
		sc.close();
	}
}
