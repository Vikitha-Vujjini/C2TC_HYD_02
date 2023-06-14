package controlStatements;
import java.util.Scanner; 
public class WhileLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array members");
		int a=0;
		while(a<n)
		{
			arr[a]=sc.nextInt();
			a++;
		}
		System.out.println("array members are:");
		a=0;
		while(a<n)
		{
			System.out.println(arr[a]);
			a++;
		}
		sc.close();
	}
}
