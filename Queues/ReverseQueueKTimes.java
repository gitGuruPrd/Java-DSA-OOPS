package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueKTimes {
	public static void reverse(Queue<Integer> input) {
		if(input.size()==0) {
			return;
		}
		int temp=input.remove();
		reverse(input);
		input.add(temp);

	}
	public static Queue<Integer> reverseKtimes(Queue<Integer> input,int k){
		if(input.size()==0 || input.size()==1 || input.size()<k) {
			return input;
		}
		int count=k;
		Queue<Integer> firstque=new LinkedList<>();
		Queue<Integer> secque=new LinkedList<>();
		for(int i=0;!input.isEmpty();i++) {
			if(i<k) {
				firstque.add(input.remove());
			}else {
				secque.add(input.remove());
			}
		}
		reverse(firstque);
		
		
//		if(secque.size()>=k) {
			Queue<Integer> last=reverseKtimes(secque, k);
			
//		}
//		while(!secque.isEmpty()) {
//			firstque.add(secque.remove());
//		}
			while(!secque.isEmpty()) {
				firstque.add(secque.remove());
			}
		return firstque;
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
