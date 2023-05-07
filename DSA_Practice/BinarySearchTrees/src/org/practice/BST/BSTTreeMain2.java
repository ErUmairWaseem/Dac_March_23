package org.practice.BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import org.practice.BST.binarySearchTree.Node;

class binarySearchTree2{
	
	static class Node{
		//Node field
		private int data;
		private Node left;
		private Node right;
		
		//method
		public Node() {
			data = 0;
			left = null;
			right = null;
		}
		public Node(int val) {
			data= val;
			left = null;
			right = null;
		}
		public int getData() {
			return data;
		}
	}
	
	//trees data
	private Node root;   //like head in DLL
	
	//trees method
	public binarySearchTree2() {
		root =null;
	}
	@SuppressWarnings("unused")
	public void add(int val) {
		Node newNode = new Node(val);
		if(root == null)
			root = newNode;
		else {
			Node trav = root;
			while(true) {
				if(val < trav.data ) {
					if(trav.left != null) {
						trav =trav.left;
					}
					else{
						trav.left = newNode;
						break;
					}
				}
				else {
					if(trav.right != null) {
						trav = trav.right;
					}
					else {
						trav.right = newNode;
						break;
					}
				}
			}
		}	 
	}
	public void preOrder(Node trav) {
		if(trav == null)
			return;
		System.out.print(trav.data+", ");
		preOrder(trav.left);
		preOrder(trav.right);
	}
	public void preOrder() {
		System.out.println("Pre Order :  ");
		preOrder(root);
		System.out.println();
	}
	public void InOrder(Node trav) {
		if(trav == null)
			return;
		InOrder(trav.left);
		System.out.print(trav.data+", ");
		InOrder(trav.right);
	}
	public void InOrder() {
		
		System.out.println("In Order :  ");
		InOrder(root);
		System.out.println();
	}
	public void postOrder(Node trav) {
		if(trav == null)
			return;
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(trav.data+", ");
	}
	public void postOrder() {         //wrapper method to access private field
		
		System.out.println("Post Order :  ");
		postOrder(root);
		System.out.println();
	}
	
	public int height(Node trav) {
		if(trav == null)
			return -1;
		int hl = height(trav.left);
		int hr = height(trav.right);
		
		int max = hl > hr ? hl : hr;
		return max +1;
	}
	public int height()
	{
		return height(root);
		/*height(root);
		System.out.println("Height:  "+height(root));*/

	}
	//postOrder traversal
	public void deleteAll(Node trav) {
		if(trav == null)
			return;
		deleteAll(trav.left);
		deleteAll(trav.right);
		trav.left = null;
		trav.right = null;  //releasing
		trav = null;
		
	}
	public void deleteAll() {
		deleteAll(root);
		root = null;
		System.out.println("All Nodes deleted...");
	}
	
	public Node bfs(int key) {
		
		Queue<Node> q = new LinkedList<>();
		
		q.offer(root);     // offer == push in queue interface
		
		while(!q.isEmpty()) {
			Node trav = q.poll();   //poll == pop
			
			if(key == trav.data)
				return trav;
			
			if(trav.left != null)
				q.offer(trav.left);
			if(trav.right != null)
				q.offer(trav.right);
			
		}
		return null;
	}
	public Node dfs(int key) {
		
		Stack<Node> s = new Stack<>();
		s.push(root);
		
		while(!s.isEmpty()) {
			Node trav = s.pop();
			
			if(key == trav.data)
				return trav;
			if(trav.right != null)
				s.push(trav.right);
			if(trav.left != null)
				s.push(trav.left);
			 
		}
		return null;
	}
	public Node binarySearch(int key) {
		Node trav = root;
		while(trav != null) {
			if(key == trav.data)
				return trav;
			if(key < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		return null;
	}
	
	public Node [] binarySearchWithParent(int key) {
		Node parent = null;
		Node trav = root;
		while(trav != null) {
			if(key == trav.data)
				return new Node [] {trav,parent};
			parent = trav;
			if(key < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		return new Node [] {null, null};
	}
	
	public void deleteVal(int val) {
		System.out.println("UMAIR");
		Node trav, parent;
		//find the node to be deleted along with it parent
		Node [] arr = binarySearchWithParent(val);
		trav = arr[0];
		parent = arr[1];
		//if node is not found, throws the exception
		if(trav == null)
			throw new RuntimeException("Node Not Found");
		//if node has left as well as right child
		if(trav.left != null && trav.right != null) {
			//find its successor with its parent
			parent = trav;
			Node succ = trav.right;
			while(succ.left != null) {
				 parent = succ;
			}
			//overwrite data of node with successor data
			trav.data = succ.data;
			//mark successor node to be deleted
			trav = succ;
		}
		//if node has right child(or node does not have left child)
		if(trav.left == null) {
			if(trav == root)
				root = trav.right;
			else if(trav == parent.left)
				parent.left = trav.right;
			else
				parent.right = trav.right;
		}
		//if node has left child (or node does not have right child)
		else if(trav.right == null) {
			if(trav == root)
				root = trav.left;
			else if(trav == parent.left)
				parent.left = trav.left;
			else
				parent.right = trav.left;
		}
	}  
}
public class BSTTreeMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		binarySearchTree t = new binarySearchTree();
		
		t.add(50);
		t.add(30);
		t.add(10);
		t.add(90);
		t.add(100);
		t.add(40);
		t.add(70);
		t.add(80);
		t.add(60);
		t.add(20);
		t.preOrder();
		t.InOrder();
		t.postOrder();
		//t.height();  //if not return the height
		System.out.println("Height of a tree :  "+t.height());
		
		/*System.out.println("Enter any number :  ");
		int x = sc.nextInt();
		 Node temp = t.bfs(x);
		 
		 if(temp == null)
			 System.out.println("BFS : Element is not found");
		 else
			 System.out.println("BFS : Element Found : "+temp.getData());
		
		 temp = t.dfs(x);
		
		 if(temp == null)
			 System.out.println("DFS : Element is not found");
		 else
			 System.out.println("DFS : Element Found : "+temp.getData());
		
		 temp = t.binarySearch(x);
		 if(temp == null)
			 System.out.println("Binary Search:  not found");
		 else
			 System.out.println("Binary Search: "+x+" is found");
		
		Node [] arr = t.binarySearchWithParent(x); 
		if(arr[0] == null)
			System.out.println("BS : Element is not found");
		else if(arr[1] == null)
			System.out.println("BS : Element Found : "+arr[0].getData() + " with parent "+ arr[1]);
		else
			System.out.println("BS : Element Found : "+arr[0].getData() + " with parent "+ arr[1].getData());
		
		t.deleteAll();
		t.InOrder();
		System.out.println("Height of a tree :  "+t.height());
		*/
		t.InOrder();
		
		System.out.print("Enter Element you want to delete: ");
		int val = sc.nextInt();
		//t.deleteVal(val);
		t.InOrder();
		
	}

}
