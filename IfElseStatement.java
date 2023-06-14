package conditionalStatements;

import java.util.Scanner;

public class IfElseStatement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Enter your age:");
		int a=sc.nextInt();
		if(a>18) {
			System.out.println(name+" is eligible to vote");
		}
		else {
			System.out.println(name+" is not eligible to vote");
		}
		sc.close();
	}
}
