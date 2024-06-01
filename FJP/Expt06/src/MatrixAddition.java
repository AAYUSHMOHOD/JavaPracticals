//Programmer Name : Aayush Mohod
//Roll No.: 32442
//Batch : L8
//Problem Statement : Perform the matrix addition for two matrices using multidimensional arrays

import java.util.Scanner;

class Demo
{
	static int SIZE1 = 2, SIZE2 = 3;
	int[][] arr = new int[SIZE1][SIZE2];
	static Scanner obj = new Scanner(System.in);

	void initialise()
	{
		System.out.println("\nEnter a matrix :");
		for(int i=0; i<SIZE1; i++)
		{
			for(int j=0; j<SIZE2; j++)
			{
				arr[i][j] = obj.nextInt();
			}
		}
	}

	void display()
	{
		for(int i=0; i<SIZE1; i++)
		{
			for(int j=0; j<SIZE2; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	Demo addition(Demo M2)
	{
		Demo M3 = new Demo();
		for(int i=0; i<SIZE1; i++)
		{
			for(int j=0; j<SIZE2; j++)
			{
				M3.arr[i][j] = arr[i][j] + M2.arr[i][j];
			}
		}
		return M3;
	}
}

public class MatrixAddition
{
	public static void main(String[] args)
	{
		Demo M1 = new Demo();
		Demo M2 = new Demo();

		M1.initialise();
		System.out.println("\nEntered matrix 1 is :");
		M1.display();

		M2.initialise();
		System.out.println("\nEntered matrix 2 is :");
		M2.display();

		Demo M3 = M1.addition(M2);
		System.out.println("\nMatrix Sum is :");
		M3.display();
	}
}