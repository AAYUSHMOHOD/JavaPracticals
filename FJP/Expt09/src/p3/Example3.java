// Programmer Name : Aayush Mohod
// Roll No. : 32442
// Batch : L8
// Problem Statement : Write a java program which use try and catch for exception handling. 

package p3;

class userArray
{
	public int[] arr = new int[2];
	final String s = null;
	
	userArray(int x, int y)
	{
		arr[0] = x;
		arr[1] = y;
	}
	
	void operation()
	{
		try
		{
			System.out.println("Try result = "+arr[0]/arr[2]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception : "+e);
		}
		finally
		{
			System.out.println("In Finally Block");
		}
		System.out.println("In Method");
	}
}

public class Example3
{
	public static void main(String[] args) 
	{
		userArray a = new userArray(12, 0);
		a.operation();
	}
}