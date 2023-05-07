package org.reverse.linkedList;

class SinglyList{
	
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
	public SinglyList() {
		this.head = null;
	}
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(head == null) 
			head = newNode;
		else
		{
			Node trav = head;
			while(trav.next != null) 
				trav = trav.next;
			
			trav.next = newNode; 
			
		}
	}
	public void display() {
		System.out.print("List :  ");
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data+"--->");
			trav = trav.next;
		}
		System.out.println("");
	}
	public void reverseList(){
		//consider current List as old and new list as empty
		Node oldHead = head;
		head = null;
		while(oldHead !=null) {
			//delete first from old list(temp)
			Node temp = oldHead;
			oldHead = oldHead.next;
			
			//add first(temp) to the new list
			temp.next = head;
			head = temp;
		}//re[eat until old list finish
	}
	public Node recReverse(Node h){
		
		if(h.next == null) {
			head = h;
			return h;
		}
		
		Node t = recReverse(h.next);
		t.next = h;
		h.next = null;
		return h;
		
	}
	
	public void recReverse() {
		
		if(head != null)
		recReverse(head);
		
	}
	public void revDisplay(Node h){
		
		if(h == null) 
			
			return ;
			revDisplay(h.next);
			System.out.print(h.data+"--->");
		}
	public void revDisplay() {
		
		System.out.print("List :  ");
		revDisplay(head);
		System.out.println("");
		}
		
}
public class LinkedList{
	

	public static void main(String[] args) {
		
		
		SinglyList list = new SinglyList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.display();
		//list.reverseList();
//		list.recReverse();
//		list.display();
		list.revDisplay();
		list.display();
		
	}

}
