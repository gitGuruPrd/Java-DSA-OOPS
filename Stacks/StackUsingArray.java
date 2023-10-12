package Stacks;

public class StackUsingArray {
 private int[] data;
 private int topIndex;
public StackUsingArray() {
	// TODO Auto-generated constructor stub
	data=new int[10];
	topIndex=-1;
} 
public int size() {
	return topIndex+=1;
}
public void push(int ele) /*throws StackFullException*/ {
	if(topIndex==data.length-1) {
//		throw new StackFullException();
		doubleCapacity();
	}
	data[++topIndex]=ele;
}
private void doubleCapacity() {
	int[] temp=data;
	data=new int[2*data.length];
	for(int i=0;i<temp.length;i++) {
		data[i]=temp[i];
	}
	
}
public boolean isEmpty() {
	return topIndex==-1;
}
public int top() throws StackEmptyException {
	if(topIndex == -1) {
		StackEmptyException e =new StackEmptyException();
		throw e;
	}
	return data[topIndex];
}
public int pop() throws StackEmptyException {
	if(topIndex==-1) {
		throw new StackEmptyException();
	}
	int temp=data[topIndex];
	topIndex--;
	return temp;
}

}
