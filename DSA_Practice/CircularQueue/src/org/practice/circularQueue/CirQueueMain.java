package org.practice.circularQueue;

class cirQueue{
	private int []arr;
	private int rear;
	private int front;
	public cirQueue(int size) {
		arr = new int[size];
		this.rear = -1;
		this.front = -1;
	}
	public void display() {
		int i;
		for(i = front; i<= rear; i++)
			System.out.println(arr[i]+" ");
		//System.out.println(arr[i]);
	}
	public void enqueue(int val) {
		if(rear == arr.length-1)
			rear = 0;
		else
			rear++;
		
		arr[rear] = val;
	}
	public void dequeue() {
		if(front == arr.length-1) 
			front =0;
		else
			front++;
		
		if(front == rear)
			front =-1;
			rear = -1;
		
	
	}
	public void peek() {
		
	}
	public boolean isFull() {
		return (front == rear && front != -1) || (front ==-1 && rear == arr.length-1);
			
		
		
		
	}
	
	
}
public class CirQueueMain {

	public static void main(String[] args) {
		
		cirQueue c = new cirQueue(6);
		
		c.enqueue(2);
		c.display();
		//c.dequeue();
		//c.peek();

	}

}
