//Programmer Name : Aayush Mohod
//Roll No.: 32442
//Batch : L8
//Problem Statement : To find sum and average of n numbers.

import java.util.Scanner;

public class SumAverage 
{
	public static void main(String[] args) 
	{
	        int n, sum = 0, x;
        float average;
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Total entries : ");
        n = obj.nextInt();
        
        System.out.println("Enter "+n+" numbers below");
        for (int i = 1; i <= n; i++)
        {
            x = obj.nextInt();
            sum += x;
        }
        
        obj.close();
        
        System.out.println("\nSum of "+n+" numbers is: "+sum);
        average = (float)sum / (float)n;
        System.out.println("Average of "+n+" numbers is: "+average);
	}
}