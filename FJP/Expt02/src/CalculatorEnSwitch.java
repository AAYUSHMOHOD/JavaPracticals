//Programmer Name : Aayush Mohod
//Roll No.: 32442
//Date : 31/07/2023
//Batch : L8
//Problem Statement : Implement a calculator with simple arithmetic operations such as 
//                    addition, substraction, multiplication, division and factorial of 
//                    a number, using switch case and other simple Java statements.
//                    (Using enhanced switch case)

import java.util.Scanner;

public class CalculatorEnSwitch
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		while(true)
		{
			System.out.println("\nEnter two nos. to perform operations on :");
			int n1, n2;
			n1 = obj.nextInt();
			n2 = obj.nextInt();
			
			System.out.println("Choose an arithmetic operation to perform :");
			System.out.println("\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Factorial\n6. Exit");
			
			int choice;
			choice = obj.nextInt();
			
			int result;
			
			result = switch(choice)
			{
			case 1 -> n1 + n2;
			
			case 2 -> n1 - n2;
			
			case 3 -> n1 * n2;
			
			case 4 -> n1 / n2;
			
			case 5 ->
			{
				System.out.println("\nChoose a no. to perform operation on :\n1. n1\n2. n2");
				int ch = obj.nextInt();
				int res;
				res = switch(ch)
				{
				case 1 -> factorial(n1);
				case 2 -> factorial(n2);
					
				default -> 
				{
					System.out.println("Enter a valid Choice");
					yield 0;
				}
				};
				yield res;
			}
			
			case 6 -> 
			{
				obj.close();
				System.exit(0);
				yield 0;
			}
			
			default -> 
			{
				System.out.println("Enter a valid Choice");
				yield 0;
			}
			};
			
			System.out.println("Answer = "+result);
		}
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