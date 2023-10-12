package Linkedlist;

public class AppendLastNToFirst{
	public static Node<Integer> appendLastNToFirst(Node<Integer> head,int n) {
		Node<Integer>tail=head;
		int count=0;
		while(tail.next!=null) {
			tail=tail.next;
		}
		return tail;
		
		
	}


}
