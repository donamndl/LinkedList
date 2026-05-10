package com.java.TrainingSession.LinkedList;

// Creating a singly linked list operation
public class SinglyLinkedList {
	
	private Node Head;  // This is the head node pointer which will point to the first node
	
	// Function to insert new node at the beginning of Linked List
	public void InsertAtBeginning(int Data) {
		Node NewNode = new Node(Data);    // Allocate memory for new node
		NewNode.next = Head;              // Assign the address of head in the next new node
		Head = NewNode;                   // Point the head node pointer to the new node
	}
	
	//Function to insert a new node at the end of the Linked List
	public void InsertAtEnd(int Data) {
		Node NewNode = new Node(Data);    // Allocate memory for new node
		// System.out.println("Address of New Node is : "+ NewNode); ---> From this we can see the address of the node where the data is being stored 
		if(Head == null) {                // Check whether the linked list is empty or not
			Head = NewNode;               // If empty, point head node pointer to new node
			return;                       // Exit the function
		}
		
		// If the linked list is not empty
		Node DummyNode = Head;               // Take a dummy pointer for iteration
		while(DummyNode.next != null) {      // Iterate until it reaches the end of the linked list
			DummyNode = DummyNode.next;      // Iteration statement
		}
		
		// Once dummy node reached the end
		DummyNode.next = NewNode;    // Assign the address of new node to the next of last node	
	}
	
	// Function to display linked list
	public void DisplayList() {
		if(Head == null) {                                   // Check whether head is null or not
			System.out.println("Linked list is empty.");     // If null, the linked list is empty
			return;                                          // Exit the function
		}
		
		// If linked list is not empty
		Node DummyNode = Head;                               // Take a dummy node pointer for iteration
		while(DummyNode != null) {                           // Iterate until we find no data
			System.out.print(DummyNode.data + " --> " );     // Print the values first
			DummyNode = DummyNode.next;                      // Then go for the next node
		}
		System.out.println("NULL");                          // Print null at the end to indicate the last node
	}
	
	// Function to search any value in linked list
	public boolean Search(int Data) {    
		Node DummyNode = Head;                 // Take a dummy node pointer for iteration
		while(DummyNode != null) {             // Iterate until we find no data
			if(DummyNode.data == Data) {       // In each node check whether the target data is equal to next 
				return true;                   // If found, return true
			}
			DummyNode = DummyNode.next;        // Then go for next node
		}
		return false;                          // If not found, return false
	}
	
	//Function to insert node at any position
	public void InsertAtPosition(int Data, int Position) {
		if(Head == null) {
			System.out.println("Linked list is empty.");
			return;
		}
		if(Position < 1) {
			System.out.println("Position must be greater than equals 1!!");
			return;
		}
		Node NewNode = new Node(Data);
		Node DummyNode = Head;
		if(Position == 1) {
			NewNode.next = Head;
			Head = NewNode;
			return;
		}
		for(int i = 1; i < Position - 1 && DummyNode != null; ++i) {
			DummyNode = DummyNode.next;
		}
		if(DummyNode == null) {
			System.out.println("Position out of range!!");
			return;
		}
		NewNode.next = DummyNode.next;
		DummyNode.next = NewNode;
	}
	
	// Function to delete a linked list by position
	public void Delete(int Position) {
		if(Head == null) {
			System.out.println("Linked List is empty!!");
			return;
		}
		if(Position < 1) {
			System.out.println("Position must be greater than 1!!");
			return;
		}
		if(Position == 1) {
			Head = Head.next;
			return;
		}
		Node DummyNode = Head;
		for(int i = 1; i < Position - 1 && DummyNode != null; ++i) {
			DummyNode = DummyNode.next;
		}
		if(DummyNode == null) {
			System.out.println("Position out of range!!");
			return;
		}
		DummyNode.next = DummyNode.next.next;																																				
	}

	// Function to delete linked list by value
	public void DeleteByValue(int Data) {
		if(Head == null) {
			System.out.println("Linked List is empty!!");
			return;
		}
		if(Head.data == Data) {
			Head = Head.next;
			return;
		}
		Node DummyNode = Head;
		while(DummyNode.next != null && DummyNode.next.data != Data) {
			DummyNode = DummyNode.next;
		}
		if(DummyNode == null || DummyNode.next == null) {
			System.out.println("Value not found!!");
			return;
		}
		DummyNode.next = DummyNode.next.next;
	}	
}