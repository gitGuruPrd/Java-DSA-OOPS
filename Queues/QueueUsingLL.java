package Queues;

import Linkedlist.Node;

public class QueueUsingLL <T> {
private Node<T> front;
private Node<T> rear;
int size;
public QueueUsingLL() {
	front=null;
	rear =null;
	size=0;
	
}
public int size() {
	return size;
}
public void enque(T ele) {
	Node<T> node=new Node<T>(ele);
	if(size==0) {
		front=node;
		
		rear=node;
		size++;
	}else {
		rear.next=node;
		rear=rear.next;
		rear.next=null;
		size++;
	}
		
		
		
	
}
public boolean isEmpty() {
	return size==0;
}
public T front() {
	
	return front.data;
}
public T deque() {
	if(size==0) {
		return null;
	}else {
		T temp= front.data;
		front=front.next;
		size--;
		return temp;
	}
}
}
