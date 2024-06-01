//Programmer Name : Aayush Mohod
//Roll No.: 32442
//Date : 31/07/2023
//Batch : L8
//Problem Statement : Design class Rectangle with data fields, width, length, area and 
//                    colour. The length, width and area are of double type and colour 
//                    is of type String. The methods are get_length(), get_width(), 
//                    get_colour() and find_area(). Create two objects of Rectangle and
//					  compare the area colour. If the area and colour, both are same
//                    for the objects, then display "Matching Rectangles", otherwise 
//                    display "Non-matching Rectangles".

import java.util.Scanner;

public class CompareRectangles 
{
	public static void main(String[] args) 
	{
		Rectangle R1 = new Rectangle();
		Rectangle R2 = new Rectangle();
		
		System.out.println("\nDescribe first Rectangle :");
		R1.get_length();
		R1.get_width();
		R1.get_colour();
		R1.calculate_area();
		
		System.out.println("\nDescribe second Rectangle :");
		R2.get_length();
		R2.get_width();
		R2.get_colour();
		R2.calculate_area();
		
		System.out.println("\nComparison :");
		R1.compare(R2);
	}
}

class Rectangle
{
	double length, width, area;
	String colour;
	Scanner obj = new Scanner(System.in);
	
	public Rectangle()
	{
		length = 0;
		width  = 0;
	}
	
	public void get_length()
	{
		System.out.print("Enter length of the rectangle : ");
		length = obj.nextDouble();
	}
	
	public void get_width()
	{
		System.out.print("Enter width of the rectangle : ");
		width = obj.nextDouble();
	}
	
	public void get_colour()
	{
		System.out.print("Enter colour of the rectangle : ");
		colour= obj.next();
	}
	
	public void calculate_area()
	{
		if(length != 0 && width != 0)
		{
			area = length * width;
		}
		else
		{
			area = 0;
		}
	}
	
	public void compare(Rectangle OtherRectangle)
	{
		if(area == OtherRectangle.area && colour.equals(OtherRectangle.colour))
		{
			System.out.println("Matching Rectangles");
		}
		else
		{
			System.out.println("Non-matching Rectangles");
		}
	}
}