package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> que= new LinkedList<Integer>();
//		que.add(23);
//		System.out.println(que.peek());
		que.add(null);
		
//		System.out.println(que.poll())
		System.out.println(que.remove());
	}

}
