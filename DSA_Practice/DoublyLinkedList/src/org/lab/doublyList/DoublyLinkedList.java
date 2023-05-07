package org.lab.doublyList;

import java.util.Scanner;

class DoublyList{
	//node class
	static class Node{
		
		//Node class fields
		private int data;
		private Node next;
		private Node prev;
		
		//Node class methods
		public Node() {
			data = 0;
			next = null;
			prev = null;
		}
		public Node(int val) {
			data =val; 
			next = null;
			prev = null;
		}
	}
	
	//list class field
		private Node head;
		
	//list class method
		public DoublyList () {
			head = null;
		}
		
	public void displayForward() {
		System.out.println("Forward List	:	");
		Node trav = head;
		while(trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println("");

	}
	
	public void displayReverse() {
		System.out.println("Reverse List  :  ");
		//Traverse till last node
		if(head == null)  // if list is empty
			return;
		Node trav = head;
		
		while(trav.next != null) 
			trav = trav.next;
		//print all nodes in reverse order
		while (trav != null){
			System.out.println(trav.data);
			trav = trav.prev;
		}
	}
	
	public boolean isEmpty()
	{
		return head == null;
		
	}
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
		}
		else
		{
			Node trav = head;
			while(trav.next != null) { 
				trav = trav.next;
				}
				trav.next = newNode;
				//new node's previous to last node
				newNode.prev = trav;
			
		}
	}

	public void addFirst(int val) {
		 
		// create a new node
		Node newNode = new Node(val);
		
		//if list is empty
		if(isEmpty()) {
			head = newNode;
		}
		else {
			//general: add node at start
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void addAtPos(int val, int pos) {
		
		if(head == null || pos <= 1) {
			addFirst(val);
		}
		else {
			//allocate node
			Node newNode = new Node(val);
			Node temp,trav = head;
			
			for(int i=1; i< pos-1; i++) {
				//special 3: if pos > length of list, add node at the end
				if(trav.next == null)
					break;
				trav = trav.next;
			}
			//take temp pointer to node after node
			temp = trav.next;
			//new Node's next should point to trav's next i.e. temp
 			newNode.next = temp;
			//new node's previous point to trav
			newNode.prev = trav;
			//trav's next points to new node
			trav.next = newNode;
			//temp's prev points to new node
			if(temp != null)  //special 3: if adding at the end
			temp.prev = newNode;
		}
	}

	public void delFirst() {
		if (head == null)
			throw new RuntimeException("List is Empty");
		if(head.next == null)
			head = null;
		else {
			head = head.next;
			
			head.prev = null;
		}
	}

	public void delAtPos(int pos) {
		if(pos == 1)
			delFirst();
		if(head == null || pos < 1)
			throw new RuntimeException("List is Empty ");
		Node trav = head;
		
		for(int i=1; i<pos; i++) {
			if(trav == null)
				throw new RuntimeException("Invalid Position");
			trav = trav.next;
		}
		trav.prev.next = trav.next;
		if(trav.next != null)
			trav.next.prev = trav.prev;
	}   
}

public class DoublyLinkedList 
{

	public static void main(String[] args) 
	{
		int choice,val,pos;
		DoublyList list = new DoublyList();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n\n0. Exit\n1. Display\n2. addFirst\n3. addLast\n4. addAtPosition\n5. delFirst\n6. delLast\n7. delAtPosition\n8. deleteAll\n   Enter Choice ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				list.displayForward();
				list.displayReverse();
				break;
			case 2:
				System.out.println("Enter Element  :  ");
				val = sc.nextInt();
				list.addFirst(val);
				break;
			case 3:
				System.out.println("Enter Element :  ");
				val = sc.nextInt();
				list.addLast(val);
				break;
			case 4:
				System.out.println("Enter Element :  ");
				val = sc.nextInt();
				System.out.println("Enter Position :  ");
				pos = sc.nextInt();
				list.addAtPos(val,pos);
				break;
			case 5:
				try 
				{
					list.delFirst();	
				} 
				catch (Exception e) 
				{
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				//list.delLast();
				break;
			case 7:
				System.out.println("Enter Position :  ");
				pos = sc.nextInt();
				try {
					list.delAtPos(pos);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 8:
				//list.delAll();
				break;
			}
		}while(choice != 0);
	}
}
