//Programmer Name : Aayush Mohod
//Roll No.: 32442
//Batch : L8
//Problem Statement : To display first 50 prime numbers.

public class PrimeNums 
{
    public static void printPrime(int n) 
    {
        int count = 0;
        boolean flag = true;
        
        for(int i = 2; count < n; i++)
        {
        	for(int j = 2; j < i; j++)
        	{
        		if(i % j == 0)
        		{
        			flag = false;
        			break;
        		}
        	}
        	
        	if(flag)
        	{
        		System.out.println(i);
        		count++;
        	}
        	flag = true;
        }
    }
    
    public static void main(String[] args)
    {
        int n = 50; 
        System.out.println("First "+n+" prime numbers are:");
        printPrime(n);
    }
}