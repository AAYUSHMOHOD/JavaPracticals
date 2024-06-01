//Programmer Name : Aayush Mohod
//Roll No.: 32442
//Batch : L8
//Problem Statement : Demonstrate the method and constructor overloading in Java programming.

class Example
{
	Example()
	{
		System.out.print("This is default constructor ");
		System.out.println("(No parameters passed)\n");
	}
	
	Example(int a)
	{
		System.out.print("This is a parameterized constructor ");
		System.out.println("with a parameter (int a = " + a + ")\n");
	}
	
	Example(String a)
	{
		System.out.print("This is a parameterized constructor ");
		System.out.println("with a parameter (String a = " + a + ")\n");
	}
	
	Example(double a)
	{
		System.out.print("This is a parameterized constructor ");
		System.out.println("with a parameter (double a = " + a + ")\n");
	}
	
	Example(int a, int b)
	{
		System.out.print("This is a parameterized constructor ");
		System.out.println("with parameters (int a = " + a + ", int b = " + b + ")\n");
	}
	
	public void finalize(){}
}

public class ConstructorOverloading
{
	public static void main(String[] args) 
	{		
		//No parameter passed
		Example obj1 = new Example();
		
		//Int parameter passed
		Example obj2 = new Example(5);
		
		//Double parameter passed
		Example obj3 = new Example(12.34);
		
		//String parameter passed
		Example obj4 = new Example("ABCDEF");
		
		//Two int parameters passed
		Example obj5 = new Example(3, 4);
		
		obj1 = null;
		obj2 = null;
		obj3 = null;
		obj4 = null;
		obj5 = null;
		
		System.gc();
	}
}