package org.practice.linerQeue;

import java.util.Scanner;

class LinearQueue{
	 private int [] arr;
	 private int rear,front;
	public LinearQueue(int size) {
		
		this.arr = new int[size];
		this.rear = -1;
		this.front = -1 ;
	}
	public boolean isFull(){
		
		return rear == arr.length-1;
		
	}
	public boolean isEmpty() {
		return rear == front;
	}
	public void enqueue(int val) {
		if(isFull())
			throw new RuntimeException("Queue is Full...");
		else
			rear++;
			arr[rear] = val;
	}
	public void dequeue() {
		if(isEmpty())
			throw new RuntimeException("Queue is Empty...");
		front++;
	}
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Queue is Empty...");
		else
		return arr [front +1];
	}
	 
}
public class LinearQueueMain {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			LinearQueue lq = new LinearQueue(6);
			
			int choice, val;
				do{
					System.out.println("\n0 Exit \n1.Add Element\n2. Delete Element\n3. Get Element\n4. isEmpty\n5. isFull ");
					choice = sc.nextInt();
				
					switch(choice) {
					case 1: 
						try 
						{
							System.out.println("Enter Element to add in Queue");
							val = sc.nextInt();
							lq.enqueue(val);
						} 
						catch (Exception e)
						{
							System.out.println(e.getMessage());
						}
						break;
					case 2:
						try {
							val = lq.peek();
							lq.dequeue();
							System.out.println("Deleted Element : "+val); 
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						break;
					case 3:
						try {
							System.out.println(" Element: "+lq.peek());
						} catch (Exception e) {
							System.out.println(e.getMessage());
						} 
						
						break;
					case 4:
						if(lq.isEmpty())
							System.out.println("Queue is Empty...");
						else
							System.out.println("Queue Not Empty");
						break;
					case 5:
						if(lq.isFull())
							System.out.println("Queue is full");
						else
							System.out.println("Queue is not full or Empty");
						break;
				}
			}while(choice != 0);
		}
	}
}
