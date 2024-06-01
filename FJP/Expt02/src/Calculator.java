//Programmer Name : Aayush Mohod
//Roll No.: 32442
//Date : 31/07/2023
//Batch : L8
//Problem Statement : Implement a calculator with simple arithmetic operations such as 
//                    addition, substraction, multiplication, division and factorial of 
//                    a number, using switch case and other simple Java statements.
//                    (Using switch case)

import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("\nEnter two nos. to perform operations on :");
			Scanner obj = new Scanner(System.in);
			int n1, n2;
			n1 = obj.nextInt();
			n2 = obj.nextInt();
			
			System.out.println("Choose an arithmetic operation to perform :");
			System.out.println("\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Factorial\n6. Exit");
			
			int choice;
			choice = obj.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Addition = "+add(n1, n2));
				break;
			case 2:
				System.out.println("Subtraction = "+sub(n1, n2));
				break;
			case 3:
				System.out.println("Product = "+mul(n1, n2));
				break;
			case 4:
				System.out.println("Quotient = "+div(n1, n2));
				break;
			case 5:
				System.out.println("\nChoose a no. to perform operation on :\n1. n1\n2. n2");
				int ch = obj.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Factorial of "+n1+" = "+factorial(n1));
					break;
				case 2:
					System.out.println("Factorial of "+n2+" = "+factorial(n2));
					break;
				default :
					System.out.println("Enter a valid Choice");
				}
				break;
			case 6:
				obj.close();
				System.exit(0);
			default :
				System.out.println("Enter a valid Choice");
			}
		}
	}
	
	public static int add(int n1, int n2) 
	{
		return n1+n2;
	}
	
	public static int sub(int n1, int n2) 
	{
		return n1-n2;
	}
	
	public static int mul(int n1, int n2) 
	{
		return n1*n2;
	}
	
	public static int div(int n1, int n2) 
	{
		return n1/n2;
	}
	
	public static int factorial(int n)
	{
      if (n == 0)
          return 1;
      int fact=1;
      for (int i = 1; i <= n; i++)
      {
          fact = fact * i;
      }
      return fact;
    }
}