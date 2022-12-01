package Factorial;

import java.util.Scanner;

public class Practice01 
{
	public static void main(String[]args)
	{
		System.out.println(" Enter Number : ");
		Scanner S = new Scanner(System.in);
		int NUM = S.nextInt();
		
		int FACT = 1;
		
		for(int i=NUM; i>=1; i--)
		{
			FACT = FACT*i;
		}
		
		System.out.println(FACT);
		
		
		
		
	}

}
