package Stacks;

import Linkedlist.Node;

public class StackUsingLL <T>{
private Node<T> head;
private int size;
public StackUsingLL() {
	// TODO Auto-generated constructor stub
	head=null;
	size=0;
}

public int size() {
	return size;
}

public boolean isEmpty() {
	return head==null;
}
public T pop() throws StackEmptyException {
	if(head==null) {
//		throw new NullPointerException();
		throw new StackEmptyException();
//		return -1;
	}
	Node<T> node=head;
	head=head.next;
	size--;
	return node.data;

}
public void push(T ele) {
	Node<T> node=new Node<T>(ele);
	node.next=head;
//	head.next=null;
	head=node;
	size++;
}
public T top() {
	return head.data;
}
}