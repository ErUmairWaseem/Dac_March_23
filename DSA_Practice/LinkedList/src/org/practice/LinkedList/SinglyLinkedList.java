package org.practice.LinkedList;

import java.util.Scanner;

class SinglyList{
	//Node is the static member class of singly list
	
	static class Node{
		//Node class fields
		private int data;
		private Node next;
		//Node class constructors
		public Node(){
			data = 0;
			next = null;
		}
		public Node(int val) {
			data = val;
			next = null;
		}
	}
	
	//List class fields
	private Node head;
	//List class method(Initially the linked list was null)
	public SinglyList() {
		this.head = null;
	}
	void display() {
		System.out.println("List :  ");
		Node trav = head;
		while(trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	void addFirst(int val) {
		//create new node and initialize it
		
		Node newnode = new Node(val);
		
		//new node next should point to head
		newnode.next = head;
		
		//head should point to new node
		head = newnode;
	}
	void addLast(int val) {
		//create new node and initialize it
		
		Node nn = new Node(val);
		//special case 1: if list is empty make new node as first node of list
		if(head == null) {
			head = nn;
		}
		//general case:  add node at last
		else {
			
			//traverse till last node
				Node trav = head;
				while(trav.next != null) {
					trav = trav.next;
				}
			
			
			// add the new node after trav.next
			trav.next = nn;
		}
	}
	public void addAtPos(int val, int pos) {
		//sepcial 1: if list is emplty add node at start
		//special 2: ifpos <=1, add node at first
		if(head == null || pos <= 1)
			addFirst(val);
		//general add node at given pos 
		else {
			//allocate and initialize the new node
			Node newNode = new Node(val);
			//traverse till pos-1(trav)
			Node trav = head;    //(start from first node till pos-1)
			for(int i=1; i<pos-1; i++) 
				// special 3: if pos > length of list,add node at the end
				if(trav.next == null)
					break;
				trav = trav.next;
			
			// newnode's next should point to trav's next
			newNode.next = trav.next;
			// trav's next should point to new node
			trav.next = newNode;
		}
	}
	public void delFirst() {
		//special 1: if list is emplty throw exception
		if(head == null)
			throw new RuntimeException("List is Empty");
		//general : make head pointing to next node
		head = head.next;
		//note: previous node will be garbage collected
	}
	public void delAll() {
		if(head == null)
			throw new RuntimeException("List is Empty");
		head = null;
		//all nodes will be garbage collected
		
	}
	public void delAtPos(int pos) {
		//special 1: if pos =1,delete first node
		if(pos == 1)
			delFirst();
		// special 2: if list is empty or pos <1, throw exception
		if(head == null || pos < 1)
			throw new RuntimeException("List is empty or Invalid position ");
		// take temp pointer running behind trav.
		Node temp=null, trav = head;
		//traverse till pos (trav)

		for(int i=1; i<pos; i++) {
			//special 3: if pos is beyond list length, then throw exception
			if(trav == null)
				throw new RuntimeException("Invalid position");
			temp = trav;
			trav = trav.next;
		}
		//trav is node to be deleted and temp is node before that
		temp.next = trav.next;
		//trav node will be garbage collected
		
	}
}

public class SinglyLinkedList {
	
	

	public static void main(String[] args) {
		int choice, val ,pos;
		
		SinglyList list = new SinglyList();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n\n0. Exit\n1. Display\n2. addFirst\n3. addLast\n4. addAtPosition\n5. delFirst\n6. delLast\n7. delAtPosition\n8. deleteAll\n   Enter Choice ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				list.display();
				break;
			case 2: 
				System.out.println("Enter new element  :  ");
				val = sc.nextInt();
				list.addFirst(val);
				break;
			case 3:
				System.out.println("Enter new element  :   ");
				val = sc.nextInt();
				list.addLast(val);
				break;
			case 4: 
				System.out.println("Enter the element : ");
				val = sc.nextInt();
				System.out.println("Enter Element position  :  ");
				pos = sc.nextInt();
				list.addAtPos(val,pos);
				break;
			case 5: 
				try {
					list.delFirst();
				} 
				catch (Exception e) {
					System.out.println(e.getMessage());	
				}
				break;
			case 6:
				System.out.println("Enter element position  :   ");
				pos = sc.nextInt();
				list.delAtPos(pos);
				break;
			case 7:
				//list.delLast();
				break;
			case 8:
				try {
					list.delAll();
				} 
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			
		} while (choice != 0);
		sc.close();
	}
}
