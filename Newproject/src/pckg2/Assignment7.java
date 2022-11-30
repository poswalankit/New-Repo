package pckg2;

import java.util.Scanner;

public class Assignment7 {
public static void main(String[] args)
{
	System.out.println("Enter a number you want to find Factorial");
	Scanner s1 = new Scanner(System.in);
	int n = s1.nextInt();
	int fact1=1;
	int i=1;
	while (i<=n)
	{
		fact1= fact1*i;
		i++;
		}
System.out.println("Factorial of number is "+fact1);
}
}
