//Programmer Name : Aayush Mohod
//Roll No.: 32442
//Batch : L8
//Problem Statement : Demonstrate the method and constructor overloading in Java programming.

import java.util.Scanner;

class Demo
{
	public int add(int a, int b)
	{
		return (a + b);
	}
	
	public double add(double a, double b)
	{
		return (a + b);
	}
	
	public String add(String a, String b)
	{
		String s = a;
		s += b;
		return s;
	}
	
	public int add(int a, int b, int c)
	{
		return (a+b+c);
	}
}

public class MethodOverloading 
{	
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		Demo mainObj = new Demo();
		
		System.out.println("\nEnter two integer nos. to add : ");
		int a =  obj.nextInt();
		int b =  obj.nextInt();
		System.out.println("Addition of two integers : "+mainObj.add(a, b));
		
		System.out.println("\nEnter two floating-point nos. to add : ");
		double c =  obj.nextDouble();
		double d =  obj.nextDouble();
		System.out.println("Addition of two floating-point nos. : "+mainObj.add(c, d));
		
		System.out.println("\nEnter two strings to concatenate : ");
		String e =  obj.next();
		String f =  obj.next();
		System.out.println("Addition of two Strings : "+mainObj.add(e, f));
		
		System.out.println("\nEnter three integer nos. to add : ");
		int g =  obj.nextInt();
		int h =  obj.nextInt();
		int i =  obj.nextInt();
		System.out.println("Addition of three integers nos. : "+mainObj.add(g, h, i));
		
		obj.close();
	}
}