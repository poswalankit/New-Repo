package pckg2;

import java.util.Scanner;

public class Assignment1 {
	
	public static void main (String[] args)
	
	{
	System.out.println("Please enter number a ");
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	System.out.println("Please enter number b");
	int b = s.nextInt();
	System.out.println("Before swapping Value of a and b are "+a+"  "+b );
	int c =a;
	 a = b;
	 b = c;	 
	System.out.println("After swapping Value of a and b are "+a+"  "+b );
	
	
	
	
	
	
	
		
		
	}

}
