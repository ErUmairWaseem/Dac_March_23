

package org.practice.circularQueue;

import java.util.Scanner;

class CircularQueue{
	private int [] arr;
	private int front ;
	private int rear;
	
	public CircularQueue(int size) {
	
		this.front = -1;
		this.rear = -1;
		this.arr = new int [size];
	}
	
	public void enqueue(int val) {
		if(isFull()) 
		
			throw new RuntimeException("Queue is full...");	
		
			//rear = (rear+1)% arr.length;
		if(rear == arr.length-1)
			rear = 0;
		else
			rear++;
		
		arr[rear] = val;	
	}
	
	public void dequeue() {
		if(isEmpty())
			throw new RuntimeException("Queue is empty...");
		
			//front = (front +1)% arr.length;
		if(front ==arr.length-1)
			front = 0;
		else
			front++;
		
			if(front == rear)
			{
				front =-1;
				rear =-1;
			}
	}
	
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("List is empty...");
	
		int index = (front +1)% arr.length;
		return arr[index];
	}
	
	public boolean isEmpty() {
		
			return (front == rear && front == -1);
	}
	
	public boolean isFull() {
		return (front == -1 && rear == arr.length-1 )|| (front == rear && front != -1);
			
	}
	
	void display()
	{
		int i;
	if (isEmpty())
		{
		System.out.println("Empty Queue");
		} 
	else
		{
		
		for (i = front; i != rear; i++ /*(i + 1) % arr.length-1*/)
	   	System.out.println(arr[i] + " ");
   		System.out.println(arr[i]);
   
 
		}
	}
}


public class CircularQueueMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CircularQueue cq = new CircularQueue(6);
		
		int choice,val;
		do {
			System.out.println("\n0. Exit\n1. Add Element\n2. Delete Element\n3. Get Element\n4. Is_Empty\n5. Is_Full\n6. Display ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				try {
					System.out.println("Enter Element");
					val = sc.nextInt();
					cq.enqueue(val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			
				break;
			case 2: 
				try {
					val = cq.peek();
					cq.dequeue();
					System.out.println("Deleted Element: "+val); 
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 3:
				try {
					System.out.println("Peek Element : "+cq.peek());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4: 
				if(cq.isEmpty())
					System.out.println("Empty");
				else
					System.out.println("Not Empty");
				break;
			case 5: 
				if(cq.isFull())
					System.out.println("Full");
				else
					System.out.println("Not full");
				break;
			case 6: 
				cq.display();
				break;
			}
		}while(choice != 0);
		sc.close();
	}
}
