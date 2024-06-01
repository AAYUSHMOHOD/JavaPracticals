//Programmer Name : Aayush Mohod
//Roll No.: 32442
//Batch : L8
//Problem Statement : Write a Java program to find factorial of the given number.

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number to find Factorial of : ");
		n = obj.nextInt();
		int fact = 1;
		if(n > 1)
		{
			for (int i = 1; i <= n; i++)
		    {
				fact = fact * i;
		    }
		}
		System.out.println("\nFactorial "+n+" is "+fact);
		obj.close();
	}
}