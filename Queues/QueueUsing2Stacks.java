package Queues;

import java.util.Stack;

public class QueueUsing2Stacks <T>{
Stack<T>  s1;
Stack<T>  s2;
public QueueUsing2Stacks() {
	s1=new Stack<T>();
	s2=new Stack<T>();
	
}
private int size() {
	return s1.size();
}
private void enque(T ele) {
	s1.push(ele);
}
private T deque() {
	if(s1.size()==0) {
		return null;
	}
	while(!s1.isEmpty()) {
		s2.push(s1.pop());
	}
	T temp = s2.pop();
	while(!s2.isEmpty()) {
		s1.push(s2.pop());
	}
	return temp;
}
private T front() {
	if(s1.size()==0) {
		return null;
	}else {
		return s1.get(0);
	}
}
}
