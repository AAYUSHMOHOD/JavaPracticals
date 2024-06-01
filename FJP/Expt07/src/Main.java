// Programmer Name : Aayush Mohod
// Roll No. : 32442
// Batch : L8
// Problem Statement : Demonstrate the concept of inheritance in Java by 
//                     designing a ‘Player’ Class. Inherit the ‘Player’ Class 
//                     to ‘Cricket_player’, ‘Football_player’, and ‘Hockey_player’ 
//                     Classes.

import java.util.Scanner;

class Player
{
	String name, gender, game, game_type;
	int age;
	
	Scanner obj = new Scanner(System.in);
	
	void get_data()
	{
		System.out.println("\nEnter name of the Player : ");
		name = obj.next();
		
		System.out.println("\nEnter age of the Player : ");
		age = obj.nextInt();
		
		System.out.println("\nEnter gender of the Player : ");
		gender = obj.next();
		
		System.out.println("\nEnter game played by the Player : ");
		game = obj.next();
		
		System.out.println("\nEnter level of the game played by the  Player : ");
		game_type = obj.next();
	}
	
	void display()
	{
		System.out.println("\nName of the Player : " + name);
		
		System.out.println("Age of the Player : " + age);
		
		System.out.println("Gender of the Player : " + gender);
		
		System.out.println("Game played by the Player : " + game);
		
		System.out.println("Level of the game played by the  Player : " + game_type);
	}
}

class Cricket_player extends Player
{
	String role;
	int runs, wickets, catches;
	
	void get_data()
	{
		super.get_data();
		
		System.out.println("\nEnter role of the Player : ");
		role = obj.next();
		
		System.out.println("\nEnter runs made by the Player : ");
		runs = obj.nextInt();
		
		System.out.println("\nEnter wickets taken by the Player : ");
		wickets = obj.nextInt();
		
		System.out.println("\nEnter catches taken by the Player : ");
		catches = obj.nextInt();
	}
	
	void display()
	{
		super.display();
		
		System.out.println("Role of the Player : " + role);
		
		System.out.println("Runs made by the Player : " + runs);
		
		System.out.println("Wickets taken by the Player : " + wickets);
		
		System.out.println("Catches taken by the Player : " + catches);
	}
}

class Football_player extends Player
{
	String role;
	int goals, saves;
	
	void get_data()
	{
		super.get_data();
		
		System.out.println("\nEnter role of the Player : ");
		role = obj.next();
		
		System.out.println("\nEnter goals taken by the Player : ");
		goals = obj.nextInt();
		
		System.out.println("\nEnter goals saved by the Player : ");
		saves = obj.nextInt();
	}
	
	void display()
	{
		super.display();
		
		System.out.println("Role of the Player : " + role);
		
		System.out.println("Goals taken by the Player : " + goals);
		
		System.out.println("Goals saved by the Player : " + saves);
	}
}

class Hockey_player extends Player
{
	String role;
	int goals, saves, tackles;
	
	void get_data()
	{
		super.get_data();
		
		System.out.println("\nEnter role of the Player : ");
		role = obj.next();
		
		System.out.println("\nEnter goals taken by the Player : ");
		goals = obj.nextInt();
		
		System.out.println("\nEnter goals saved by the Player : ");
		saves = obj.nextInt();
		
		System.out.println("\nEnter tackles by the Player : ");
		tackles = obj.nextInt();
	}
	
	void display()
	{
		super.display();
		
		System.out.println("Role of the Player : " + role);
		
		System.out.println("Goals taken by the Player : " + goals);
		
		System.out.println("Goals saved by the Player : " + saves);
		
		System.out.println("Tackles by the Player : " + tackles);
	}
}

public class Main 
{
	public static void main(String[] args)
	{
		Cricket_player C1 = new Cricket_player();
		
		Football_player F2 = new Football_player();
		
		Hockey_player H3 = new Hockey_player();
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Choose the sport of Player\n1. Cricket\n2. Football\n3. Hockey\n");
		int choice = obj.nextInt();
		
		switch(choice)
		{
		case 1:
			C1.get_data();
			C1.display();
			break;
			
		case 2:
			F2.get_data();
			F2.display();
			break;
			
		case 3:
			H3.get_data();
			H3.display();
			break;
			
		default:
			System.out.println("Enter valid choice");
		}		
		
		obj.close();
	}
}