// Programmer Name : Aayush Mohod
// Roll No. : 32442
// Batch : L8
// Problem Statement : Perform file handling operation to read from 
//                                  one file and write to another file line by line 
//                                  using JAVA programming.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		String inputFile = "input.txt";
		String outputFile = "output.txt";

		try
		{
			File inputFileObj = new File(inputFile);
			File outputFileObj = new File(outputFile);

			if (!inputFileObj.exists())
			{
				System.out.println("\nInput file does not exist. Creating a new one.");
				inputFileObj.createNewFile();
				System.out.println("Input file created successfully.");
			}

			if (!outputFileObj.exists())
			{
				System.out.println("\nOutput file does not exist. Creating a new one...");
				outputFileObj.createNewFile();
				System.out.println("Output file created successfully.");
			}

			Scanner scanner = new Scanner(inputFileObj);
			FileWriter writer = new FileWriter(outputFileObj);

			while (scanner.hasNextLine())
			{
				String line = scanner.nextLine();
				writer.write(line + "\n");
			}
			scanner.close();
			writer.close();

			System.out.println("\nFile copied successfully.");

			if (inputFileObj.exists())
			{
				inputFileObj.delete();
				System.out.println("\nInput file deleted successfully.");
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}