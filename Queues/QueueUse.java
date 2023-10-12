package Queues;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException, QueueFullException {
		// TODO Auto-generated method stub
		QueueUsingArray que= new QueueUsingArray(3);
		int[] array= {1,2,3,4,5,6,7,8}; 
		for (int i : array) {
			que.enqueue(i);
		}
		while(!que.isEmpty()) {
			System.out.println(que.dequeue());
		}
	}

}
