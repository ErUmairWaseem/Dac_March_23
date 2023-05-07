

package org.practice.hashtable;

import java.util.LinkedList;
import java.util.Scanner;

class HashTable{
	
	static class Pair{   //like node in linked list
		
		private int key;   //rollNo
		private String value;  //Name
		
		public Pair() {
			this.key = 0;
			this.value = "";
		}

		public Pair(int key, String value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Pair [key=" + key + ", value=" + value + "]";
		}
		
		
	}
	
	private static final int SLOTS = 10;
	private LinkedList<Pair> table[];
	
	public int hash(int key) {
		return key % SLOTS;
	}
	@SuppressWarnings("unchecked")
	public HashTable() {
		table = new LinkedList[SLOTS];
		for (int i = 0; i < SLOTS; i++) 
			table [i] =  new LinkedList<>();
	} 
	
	public void put(int key, String value) {
				//find slot for given key using hash function
						int slot = hash(key);
						//access the bucket(Linked List) in that slot
						LinkedList<Pair> bucket =table[slot];
						//find the element (key_value) in that bucket -- linear search
						 for (Pair pair : bucket) {
								if(key == pair.key) {
									pair.value = value;
								return;
							}
						}
						 //if key not found, create new pair and add into bucket
						 Pair pair = new Pair(key, value);
						 bucket.add(pair);
						 System.out.println("Added : "+pair);
	}
	
	public String get(int key) {      //1:45:00
		//find slot for given key using hash function
		int slot = hash(key);
		//access the bucket(Linked List) in that slot
		LinkedList<Pair> bucket =table[slot];
		//find the element (key_value) in that bucket -- linear search
		 for (Pair pair : bucket) {
			if(key == pair.key)
				return pair.value;
		}
		 //if key not found
		return null;
	}
	
}


public class HashTableMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashTable ht = new HashTable();
		
		ht.put(1, "Umair");
		ht.put(4, "Waseem");
		ht.put(8, "Amit");
		ht.put(5, "Akash");
		ht.put(24, "Vishal");
		ht.put(34, "Sandeep");
		ht.put(25, "Nilesh");
		ht.put(1, "Rohan");
		
		System.out.println("Enter Roll No to find : ");
		int roll = sc.nextInt();
		String Name = ht.get(roll);
		System.out.println("Name Found : "+Name);
		sc.close();
	}

}
