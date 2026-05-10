package com.java.TrainingSession.LinkedList;

//Creating a single node
public class Node {
	
	int data;    // To store the value
	Node next;    // To store the address of the next node; Node is taken here and not data type so to take reference as it will not connect because it will form single single nodes
	Node(int data){
		this.data = data;
		this.next = null;    // Next should be null after every append of new node
	}
}
