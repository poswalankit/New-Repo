package pckg2;

import java.util.Scanner;

public class Assignment4 {
	
	public static void main(String[] args)
	{
		System.out.println("Please enter 3 digit number");
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		int r;
		int sum=0;
		int c = n;
		
		while (n>0)
		{
			r=n%10;
			sum=(sum * 10)+r;
			n=n/10;		
		}
		if (c == sum)
		{
			
			System.out.println("Number is Pallindrome");
		}
		else {System.out.println("Number is not Pallindrome"); }
	}

}
