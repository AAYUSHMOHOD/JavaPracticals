//Programmer Name : Aayush Mohod
//Roll No.: 32442
//Batch : L8
//Problem Statement : Create and sort array for -
//                                  1) List of integers
//                                  2) List of names

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class StringSort
{
	public static void main(String[] args)
	{
		boolean keepGoing = true;

		arrayClassForString obj = new arrayClassForString();

		do
		{
			System.out.println("\nChoose an operation to perform :");
			System.out.println("1. Initialise an String Array");
			System.out.println("2. Sort the Array (Manually)");
			System.out.println("3. Sort the Array (using in-built method)");
			System.out.println("4. Sort the Array in descending order (Manually)");
			System.out.println("5. Sort the Array in descending order (using in-built)");
			System.out.println("6. Find an element in the Array(manually)");
			System.out.println("7. Find an element in the Array(using in-built method)");
			System.out.println("8. Display the Array");
			System.out.println("9. Exit");

			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();

			switch (choice)
			{
				case 1 -> obj.initialise();
				case 2 -> obj.sortManually();
				case 3 -> obj.sortInBuilt();
				case 4 -> obj.sortDescendingManually();
				case 5 -> obj.sortDescendingInBuilt();
				case 6 -> obj.findElementManually();
				case 7 -> obj.findElementInBuilt();
				case 8 -> obj.display();
				case 9 -> keepGoing = false;
				default -> System.out.println("Enter a valid choice");
			}
		}while(keepGoing);
	}
}

class arrayClassForString
{
	static int size = 5;
	String[] arr = new String[size];
	Scanner obj = new Scanner(System.in);
	boolean initialised = false;

	void initialise()
	{
		System.out.print("\nEnter "+ size +" String values in array : ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = obj.next();
		}

		initialised = true;
	}

	void sortManually()
	{
		if(initialised)
		{
			for(int i = 0; i < arr.length; i++)
			{
				for(int j = i+1; j < arr.length; j++)
				{
					if(arr[i].compareTo(arr[j]) > 0)
					{
						String temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.print("\nArray Sorted");
			display();
		}
		else
		{
			System.out.println("\nInitialise a Array first.");
		}
	}

	void sortInBuilt()
	{
		if(initialised)
		{
			Arrays.sort(arr);
			System.out.print("\nArray Sorted");
			display();
		}
		else
		{
			System.out.println("\nInitialise a Array first.");
		}
	}

	void sortDescendingManually()
	{
		if(initialised)
		{
			for(int i = 0; i < arr.length; i++)
			{
				for(int j = i+1; j < arr.length; j++)
				{
					if(arr[i].compareTo(arr[j]) < 0)
					{
						String temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.print("\nArray Sorted (in Descending)");
			display();
		}
		else
		{
			System.out.println("\nInitialise a Array first.");
		}
	}

	void sortDescendingInBuilt()
	{
		if(initialised)
		{
			Arrays.sort(arr, Collections.reverseOrder());
			System.out.print("\nArray Sorted (in Descending)");
			display();
		}
		else
		{
			System.out.println("\nInitialise a Array first.");
		}
	}

	void display()
	{
		if(initialised)
		{
			System.out.print("\nArray : ");
			for (String j : arr) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		else
		{
			System.out.println("\nInitialise a Array first.");
		}
	}

	void findElementManually()
	{
		if(initialised)
		{
			System.out.print("\nEnter an element to search for : ");
			String element = obj.next();

			int index = -1;
			for(int i = 0; i < arr.length; i++)
			{
				if(element.equals(arr[i]))
				{
					index = i;
				}
			}
			if(index >= 0)
			{
				System.out.println(element+" found at position : "+(index+1));
			}
			else
			{
				System.out.println(element + " not found in the Array");
			}
		}
		else
		{
			System.out.println("\nInitialise a Array first.");
		}
	}

	void findElementInBuilt()
	{
		if(initialised)
		{
			System.out.print("\nEnter an element to search for : ");
			String element = obj.next();
			sortInBuilt();
			int index = Arrays.binarySearch(arr, element);

			if(index >= 0)
			{
				System.out.println(element+" found at position : "+(index+1));
			}
			else
			{
				System.out.println(element + " not found in the Array");
			}
		}
		else
		{
			System.out.println("\nInitialise a Array first.");
		}
	}
}