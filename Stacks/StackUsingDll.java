package Stacks;

import Linkedlist.Node;

public class StackUsingDll {
LLNode mid;
private LLNode head;
private int size;
public StackUsingDll() {
	size=0;
	mid=null;
	head=null;
}
public void push(int ele) {
	
	LLNode node=new LLNode(ele);
	node.next=head;
//	head.next=null;
	size++;
	if(head!=null) {
		head.prev=node;
		if(size%2!=0) {
			mid=mid.prev;
		}
	}else {
		mid=node;
		
	}
	
	head=node;
}
public int middle() {
	return mid.data;
}
public int popMiddle() {
	size--;
	LLNode temp=mid;
	mid.next.prev=mid.prev;
	mid.prev.next=mid.next;
	if(size%2!=0) {
		mid=mid.prev;
	}else {
		mid=mid.next;
	}
	return temp.data;
	
}
public int pop() {
	if(size==0) {
		return -1;
	}
	size--;
	LLNode temp=head;
	head=head.next;
	head.prev=null;
	if(size%2==0) {
		
	}
	
	return temp.data;
}
}
