package p4;

import p3.QueueImplementation;

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      QueueImplementation q = new QueueImplementation(5);

      while(true)
      {

          System.out.println("\nChoose an operation to perform\n1. Enqueue\n2. Dequeue\n3. Exit");

          Scanner obj = new Scanner(System.in);
          int choice = obj.nextInt();
          
          switch (choice)
          {
             case 1:
                q.enqueue();
                break;
             case 2:
                q.dequeue();
                break;
             case 3:
            	 obj.close();
        	     System.exit(1);
        	     break;
             default:
                System.out.println("\nEnter valid choice");
          }
      }
   }
}

