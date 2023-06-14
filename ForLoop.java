package controlStatements;
import java.util.Scanner;
public class ForLoop {
	static boolean prime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int s=sc.nextInt();
		System.out.println("Enter second number:");
		int e=sc.nextInt();
		System.out.println("Prime numbers between "+s+" and "+e+" are:");
		for(int i=s;i<=e;i++)
		{
			if(prime(i))
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}
