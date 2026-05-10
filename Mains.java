package com.java.TrainingSession.LinkedList;

public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList List = new SinglyLinkedList();
		List.InsertAtEnd(20);
		// List.InsertAtEnd(500);
		List.InsertAtBeginning(25);
		//List.InsertAtBeginning(85);
		List.InsertAtPosition(100,2);
		// List.Delete(3);
		List.DeleteByValue(20);
		List.DisplayList();
		System.out.println(List.Search(100));
	
		
	}

}
