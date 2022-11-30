package pckg2;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.out.println("Enter the number you want to Print the Table");
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		int t=1;
		
		for (int i=1;i<=10;i++)
		{
			t=n*i;
			System.out.println(n+" x "+i+" = "+t);
			
		}

	}

}
