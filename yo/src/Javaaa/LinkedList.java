package Javaaa;

public class LinkedList {
	static Node head; //head: Static variable that serves as the starting point of the linked list.
	
		private static class Node {//Node Class: This is a nested static class within the LinkedList class. It represents each element (node) of the linked list.
			private int data; //int data: Stores the integer value of the node.
			private Node next; //Node next: Points to the next node in the linked list. Initialized to null in the constructor.
	
			public Node(int data) {// Initializes a new node with the given data. Sets next to null, indicating it's the last node initially.
				this.data = data;
				this.next = null;
		}
	}

	public static void printNode() { //printNode(): Iterates through the linked list starting from head, prints each node's data, and then moves to the next node until it reaches null, indicating the end of the list.
		Node current = head;
		while (current != null) {
			System.out.println(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static Node reverseList(Node head) {//This method traverses the linked list starting from head and prints each nodes data followed by arrow
		Node prev = head.next;
		Node next = head.next.next;	
		head.next = null;

		while (prev != null) {
			prev.next = head;
			head = prev;
			prev = next;
			if (next != null)
				next = next.next;
		}
		return head;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		LinkedList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		LinkedList.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		LinkedList.printNode();
		LinkedList.head = LinkedList.reverseList(LinkedList.head);
		LinkedList.printNode();
	}
}
/*
 This Java program demonstrates a simple implementation of a singly linked list and its reversal functionality.
 The `LinkedList` class defines a linked list structure with a nested `Node` class containing an integer data field 
 and a reference to the next node in the list. Initially, nodes are created with values 1 through 5 and linked together sequentially.
  The `printNode()` method iterates through the list from the `head` node and prints each node's data, followed by "null" 
  to indicate the end of the list. 
The `reverseList()` method takes the head node of the list as input and reverses the order of nodes iteratively. 
It starts by initializing `prev` to the second node (initially `head.next`), `next` to 
the third node (`head.next.next`), and breaks the link from `head` to `prev` by setting `head.next` to `null`. 
It then iterates through the list, reversing pointers: `prev.next` points to `head`, `head` moves to `prev`, and `prev` 
progresses to `next`. This continues until `prev` becomes `null`, at which point the reversed list's new head (`head`) is returned. 

In `main()`, a linked list instance is created, nodes are linked together, and then `printNode()` is 
called to display the list in its original order. After calling `reverseList()` with the list's head node,
 `printNode()` is called again to show the reversed order of nodes. This program provides a basic understanding of 
 linked list traversal, node manipulation, and list reversal in Java.
 */
