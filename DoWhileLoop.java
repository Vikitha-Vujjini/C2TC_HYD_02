package controlStatements;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=0;
		do
		{
			sum+=n%10;
			n=n/10;
		}
		while(n>0);
		System.out.println("The sum of digits of number "+n+" is "+sum);
		sc.close();
	}
}
