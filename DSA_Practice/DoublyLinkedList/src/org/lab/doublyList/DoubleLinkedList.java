package org.lab.doublyList;
class DoubleList{
	
	static class Node{
		
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int val) {
			this.data = val;
			this.next = null;
			this.prev = null;
		}
	}
	private Node head;
	public DoubleList() {
		head = null;
	}
	public void addFirst(int val) {
		
		Node newNode = new Node(val);
		if(head == null)
			head = newNode;
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		
	}
	public void displayForward() {
		System.out.println("Forward List : ");
		Node trav = head;
		while(trav != null){
			System.out.print(trav.data+"-->");
			trav = trav.next;
		}
		System.out.println();
	}
	public void displayBackword() {
		Node trav = head;
		while(trav.next!=null) {
			trav = trav.next;
		}
		while(trav != null) {
			System.out.print(trav.data+"-->");
			trav = trav.prev;
		}
		System.out.println();
		
	}
	public void addLast(int val) {
		Node trav = head, newNode = new Node(val);
		if(head == null)
			head = newNode;
		else {
			while(trav.next != null) {
				trav = trav.next;
			}
				trav.next = newNode;
				newNode.prev = trav; 
			
		}
	}
	public void addAtPos(int val, int pos) {
		Node newNode = new Node(val);
		if(head == null || pos < 1)
			addFirst(val);
		else {
			Node trav = head;
			for(int i=1; i<pos-1; i++) {
			
				trav = trav.next;
			}
			newNode.next = trav.next;
			newNode.prev = trav;
			trav.next = newNode;
			trav.next.prev = newNode;
		}
		
	}
	public void delLast() {
		Node trav = head;
		while(trav.next!= null) {
			trav = trav.next;
			
		}
		trav.prev.next = null;
		
	}
	public void delAtPos(int pos) {
		Node trav = head;
		
		for(int i=1; i<pos; i++) {
			trav = trav.next;
			
		}
		
		trav.prev.next = trav.next;
		trav.next.prev = trav.prev;
		System.out.println("Deleted");
		
	}	
}
public class DoubleLinkedList {

	public static void main(String[] args) {
		DoubleList dl = new DoubleList();
		
		dl.addFirst(50);
		dl.addFirst(40);
		dl.addFirst(30);
		dl.addFirst(20);
		dl.addFirst(10);
		dl.displayForward();
		dl.displayBackword();
		
		dl.addLast(60);
		dl.displayForward();
		dl.displayBackword();
		
		dl.addAtPos(45,5);
		dl.addAtPos(25, 3);
		dl.addAtPos(5, -5);
		dl.displayForward();
		dl.displayBackword();   //error

		
		dl.delLast();
		dl.displayForward();
		dl.displayBackword();
		
		dl.delAtPos(2);
		dl.displayForward();
		dl.displayBackword();
	}

}
