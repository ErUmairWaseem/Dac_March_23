package org.practice.LinkedList;

import java.util.Scanner;

class singleList{
	
	static class Node{
		private int data;
		private Node next;
		
		public Node() {
			data = 0;
			next = null;
		}
		public Node(int val) {
			data = val;
			next = null;
		}
		
		
	}
	private Node head;
	public singleList() {
		head = null;
	}
	public void addFirst(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		
		head = newNode;
		
	}
	public void display() {
		System.out.println("Linked List :  " );
		Node trav = head;
		while(trav!=null) {
			System.out.print(trav.data+" --> ");
			trav = trav.next;
		}
		System.out.println();
	}
	public void addLast(int val) {
	
		Node trav=head,  newNode = new Node(val);
		
		if(head == null)
			head = newNode;
		else {
			
			while(trav.next != null) {
				trav = trav.next;
				
			}
			trav.next = newNode;
		}
	}
	public void addAtPos(int val, int pos) {
		Node newNode = new Node(val);
		
		if(head == null || pos <= 1)
			addFirst(val);
		else {
			Node trav =head;
			for(int i=1; i< pos-1; i++) {
				if(trav.next == null)
					break;
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}	
	}
	public void delFirst() {
		head = head.next;
	}
	public void delLast() {
		Node trav = head;
		Node temp = null;
		while(trav.next != null) {
			temp = trav;
			trav = trav.next;
		}
		temp.next = null;
	}
	public void delAtPos(int pos) {
		Node trav=head, temp = null;
		for(int i=1; i<pos; i++) {
			temp = trav;
			trav = trav.next;
		}
		temp.next = trav.next;
		
	}
}

public class SinglyListMain {
	
	public static void main(String[] args) {
		singleList s = new singleList();
		s.addFirst(12);
		s.addFirst(10);
		s.addFirst(8);
		s.addFirst(6);
		s.addFirst(2);
		s.display();
		
		s.addLast(15);
		s.addLast(18);
		s.display();
		
		s.addAtPos(16,7);
		s.addAtPos(4, 2);
		s.addAtPos(1, -2);
		s.display();
		
		s.delFirst();
		s.display();
		
		s.delLast();
		s.display();
		
		s.delAtPos(3);
		s.delAtPos(6);
		s.display();

	}

}
