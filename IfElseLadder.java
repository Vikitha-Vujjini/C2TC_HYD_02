package conditionalStatements;
import java.util.Scanner;
public class IfElseLadder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your percentage:");
		float per=sc.nextFloat();
		if(per>=90)
			System.out.println("Grade: O");
		else if(per>=80)
			System.out.println("Grade: A+");
		else if(per>=70)
			System.out.println("Grade: A");
		else if(per>=60)
			System.out.println("Grade: B+");
		else if(per>=50)
			System.out.println("Grade: B");
		else if(per>=40)
			System.out.println("Grade: C");
		else
			System.out.println("Fail");
		sc.close();
	}
}
