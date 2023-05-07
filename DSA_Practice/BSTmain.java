//Tree

class binarytree{
	
	class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(){
			data = 0;
			left = null;
			right = null;
		}
		public Node(int val){
			data = val;
			left = null;
			right = null;
		}
	}
	
		private Node root;
		public binarytree(){
			root = null;
		}
		
		public void add(int val){
			Node newNode = new Node(val);
			if(root == null){
				root = newNode;
			}
			else{
					Node trav = root;
				while(true){
					if(val < trav.data){
						if(trav.left != null){
							trav = trav.left;
						}
						else{
							trav.left = newNode;
							break;
						}
					}
					else{
						if(trav.right != null){
							trav = trav.right;
						}
						else{
							trav.right = newNode;
							break;
						}
					}
				}
			}
		}
		public void preOrder(Node trav){
			if(trav == null)
				return;
			System.out.print(trav.data+", ");
			preOrder(trav.left);
			preOrder(trav.right);
		}
		public void preOrder(){
			System.out.println("Pre Oreder :  ");
			preOrder(root);
			System.out.println();
		}
}
public class BSTmain{
	public static void main(String [] args){
		binarytree t = new binarytree();
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
	}
}