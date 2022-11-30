package pckg2;

import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String[] args)
	{int count =0;
		System.out.println("Please enter your number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i=1; i<=a;i++)
		{
			
			if(a%i ==0)
				{
				count++;
				}
		}
		if(count ==2)
		{
			System.out.println("Number is Prime Number");
		}
		else {
			System.out.println("Number is not Prime");
			
		}
		
		
		
	}
		
}
