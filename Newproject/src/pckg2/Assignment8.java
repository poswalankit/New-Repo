package pckg2;

import java.util.Scanner;

public class Assignment8 {
	public static void main(String[] args)
	{
		System.out.println("Enter number for Fibonacci series");
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		int i;
		int fib;
		int a=0;
		int b=1;
		for (i = 1;i<=n;i++)
		{
			System.out.print(a+" ");
			fib = a+b;
			a=b;
			b=fib;
			
			
		}
		
		
		
		
		
		
	}

}
