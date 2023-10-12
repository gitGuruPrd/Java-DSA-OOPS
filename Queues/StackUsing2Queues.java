package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
private Queue<Integer> q1;
private Queue<Integer> q2;
public StackUsing2Queues() {
	q1=new LinkedList<Integer>();
	q2=new LinkedList<Integer>();
	
}
public int getSize() {
	return q1.size();
}
public boolean isEmpty() {
	return q1.size()==0;
}
public void push(int element) {
	q1.add(element);

}
public int pop() {
	int temp;
	while(q1.size()!=1) {
		q2.add(q1.remove());
	}
	temp=q1.remove();
	while(!q2.isEmpty()) {
		q1.add(q2.remove());
	}
	return temp;
}
}
