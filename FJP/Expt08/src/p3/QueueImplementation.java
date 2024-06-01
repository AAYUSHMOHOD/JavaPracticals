package p3;

import p1.Queue;
import p2.QueueMethods;
import java.util.Scanner;

public class QueueImplementation extends Queue implements QueueMethods
{
   Scanner obj = new Scanner(System.in);
   
   public QueueImplementation(int capacity)
   {
      super(capacity);
   }

   public int size()
   {
      return count;
   }

   public boolean isFull()
   {
      return (size() == capacity);
   }

   public boolean isEmpty()
   {
      return (size() == 0);
   }

   public void display()
   {
      if(isEmpty())
      {
         System.out.println("Queue is Empty");
      }
      else
      {
         System.out.print("Queue : ");
         for(int i = front; i <= rear; i++)
         {
            System.out.print(queueArray[i] + "\t");
         }
         System.out.println();
      }
   }

   public void enqueue()
   {
      if(isFull())
      {
         System.out.println("Queue is Full");
      }
      else
      {
         rear++;
         System.out.print("\nEnter an Integer : ");
         queueArray[rear] = obj.nextInt();
         count++;
         display();


      }
   }

   public void dequeue()
   {
      if(isEmpty())
      {
         System.out.println("Queue is Empty");
      }
      else
      {
         int temp = queueArray[front];
         System.out.println("Dequeued element : "+temp);
         front++;
         count--;
         display();
      }
   }
}