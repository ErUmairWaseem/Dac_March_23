
package org.practice.BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.practice.BST.BinatryTrees.Node;

class BinatryTrees{
	
	static class Node{
		
		private int data;
		private Node left;
		private Node right;
		
		public Node() {
			data = 0;
			left = null;
			right = null;
		}
		
		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}

		public int getData() {
			return data;
		}
		
	}
	private Node root;
	public BinatryTrees() {
		root = null;
	}
	public void add(int val) {
		Node newNode = new Node(val);
		if(root == null) 
			root = newNode;
		else {
			Node trav = root;
			while(true) {
				if(val < trav.data) {
					if(trav.left != null)
						trav = trav.left;
					else {
						trav.left = newNode;
					break;
					}
				}
				else {
					if(trav.right != null) 
						trav = trav.right;
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
		System.out.println("Pre Order : ");
		preOrder(root);
		System.out.println();
	}
	public void inOrder(Node trav) {
		if(trav == null) 
			return;
		inOrder(trav.left);
		System.out.print(trav.data+"' ");
		inOrder(trav.right);
		
	}
	public void inOrder() {
		System.out.println("In Order : ");
		inOrder(root);
		System.out.println();
	}
	public void postOrder(Node trav) {
		if(trav == null)
			return;
		
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(trav.data+", ");
	}
	public void postOrder() {
		System.out.println("Post Order: ");
		postOrder(root);
		System.out.println();
		
	}
	public int treeHeight(Node trav) {
		if(trav == null)
			return-1;
		int h1 = treeHeight(trav.left);
		int h2 = treeHeight(trav.right);
		int max = h1 > h2 ? h1 : h2;
		return max+1;
	}
	public int treeHeight() {
		return treeHeight(root);
		
	}
	public void deleteAll(Node trav) {
		if(trav == null)
			return;
		deleteAll(trav.left);
		deleteAll(trav.right);
		trav.left=null;
		trav.right=null;
		trav = null;
	}
	public void deleteAll() {
		deleteAll(root);
		root = null;
		System.out.println("All Node Deleted...");
		
	}
	public Node searchKey(int key) {
		Node trav = root;
		while(trav!= null) {
			if(key == trav.data)
				return trav;
			else if(key < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		return null;	
	}
	public Node[] searchWithParent(int key) {
		Node trav = root;
		Node parent = null;
		while(trav != null) {
			if(key == trav.data)
				return new Node [] {trav,parent};
			parent = trav;
			if(key < trav.data)
				trav= trav.left;
			else
				trav = trav.right;
		}
		return new Node [] {null,null};
	}
	public Node bfs(int key) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			Node trav = q.poll();
			
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
	
	
}
public class BSTPractice {

	public static void main(String[] args) {
		BinatryTrees bt = new BinatryTrees();
		bt.add(50);
		bt.add(30);
		bt.add(10);
		bt.add(90);
		bt.add(100);
		bt.add(40);
		bt.preOrder();
		bt.postOrder();
		bt.inOrder();
		System.out.println("Height of tree :  "+bt.treeHeight());
		
		Node temp = bt.searchKey(30);
		if(temp == null)
			System.out.println("key Not Found");
		else
		System.out.println(" Found");
		
		Node arr [] = bt.searchWithParent(100);
		if (arr[0] == null)
			System.out.println("B.S. Not found ");
		else if(arr[1] == null)
			System.out.println("B.S... Found "+arr[0].getData()+" with parent "+arr[1]);
		else
			System.out.println("B.S. Found "+arr[0].getData()+" with parent "+arr[1].getData());
		temp = bt.bfs(40);
		if(temp == null)
			System.out.println("BFS..Not Found");
		else
			System.out.println("BFS Found.."+temp.getData());
		temp = bt.dfs(40);
		if(temp == null)
			System.out.println("DFS... Not Found");
		else
			System.out.println("DFS...Found"+temp.getData());
		bt.deleteAll();
		bt.preOrder();
		System.out.println("Height of tree :  "+bt.treeHeight());

		
	}

}
