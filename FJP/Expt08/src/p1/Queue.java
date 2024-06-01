package p1;

public class Queue 
{
	public int queueArray[];
	public int front;
	public int rear;
	public int count;
	public int capacity;
	
	public Queue(int capacity)
	{
		queueArray = new int[capacity];
		this.capacity = capacity;
		count = 0;
		front = 0;
		rear = -1;
	}
}