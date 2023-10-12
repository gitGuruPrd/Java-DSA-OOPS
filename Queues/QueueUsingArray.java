package Queues;

public class QueueUsingArray {
/*private int[] data;
private int front;
private int rear;
private int size;
public QueueUsingArray() {
	int[] data= new int[5];
	front=-1;
	rear=-1;
	
}
public QueueUsingArray(int capacity) {
	int[] data= new int[capacity];
	front=-1;
	rear=-1;
	
}
public int size() {
	return size;
}
public boolean isEmpty() {
	return size==0;
}
private void increaseCpacity() {
	int temp[]=data;
	data= new int[2*temp.length];
	int index=0;
	for(int i=front;i<temp.length;i++) {
		data[index++]=temp[i];
	}
	for(int i=0;i<front-1;i++) {
		data[index++]=temp[i];
	}
	front=0;
	rear=temp.length-1;
}
public void enQueue(int ele) {
	
	if(front==-1) {
		front=0;
		rear=0;
		data[0]=ele;
	}else {
//		rear++;
//		if(rear==data.length) {
//			rear=0;
//		}
		rear=(rear+1)%data.length;
		data[rear]=ele;
		
	}
	size++;
}
public int deQueue()  {
	
	int temp=data[front];
//	front++;
	size--;
	front=(front+1)%data.length;
//	if(front==data.length) {
//		front=0;
//	}
	if(size==0) {
		front=-1;
		rear=-1;
	}
	return temp;
}
public int front() {
	if(front==-1) {
		return -1;
	}else {
		return data[front];
	}
}*/
	private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(){

        data= new int[5];
        front= -1;
        rear= -1;
    }

    public QueueUsingArray(int capacity){

        data= new int[capacity];
        front= -1;
        rear= -1;
    }

    public int size(){
      return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(int elem) throws QueueFullException{
      if(size== data.length){
        throw new QueueFullException();
      }
      if(size==0){
        front=0;
      }
        rear++;
        data[rear]= elem;
        size++;
    }

    public int front() throws QueueEmptyException{
        if(size==0){
            throw new QueueEmptyException();
        }
        return data[front];
    }

    public int dequeue() throws QueueEmptyException{
      if(size == 0){
        throw new QueueEmptyException();
        }
        int temp= data[front];
        front++;
        size--;
        if(size==0){
            front=-1;
            rear= -1;
        }
        return temp;
    }

}


