package pckg2;

import java.util.Scanner;

public class Asg5 {
	
	public static void main(String[] args)
	{
		System.out.println("Please enter  number");
		Scanner s2 = new Scanner(System.in);
		int n = s2.nextInt();
		int r,c , arm =0;
		c =n;
		
		while(n>0)
		{
			r=n%10;
			arm = (r*r*r)+arm;
			n=n/10;
			
		}
		if(c ==arm)
		{
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not Armstrong");
		}
	}
	

}
