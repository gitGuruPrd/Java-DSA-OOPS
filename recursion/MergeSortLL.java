package recursion;
class LinkedListNode<T>{
	T data;
	LinkedListNode next;
	public LinkedListNode(T data) {
		// TODO Auto-generated constructor stub
		this.data=data;
	}
}
class dNode{
	LinkedListNode fnode;
	LinkedListNode snode;
	dNode(){
		
	}
	dNode(LinkedListNode<Integer>fnode,LinkedListNode<Integer> snode){
		this.fnode=fnode;
		this.snode=snode;
	}
}
public class MergeSortLL {
public static dNode divide(LinkedListNode<Integer>head) {
	dNode dn;
	if(head==null || head.next==null) {
		return dn=new dNode(head,head);
	}
	LinkedListNode<Integer>slow=head,fast=head;
	while(fast.next!=null && fast.next.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
	}
	LinkedListNode<Integer> newhead=slow.next;
	slow.next=null;
	dn= new dNode(slow,newhead);
	return dn;
	
	
	
}
public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1,LinkedListNode<Integer>head2) {
	if(head1==null) {
		return head2;
	}if(head2==null) {
		return head1;
	}
	LinkedListNode<Integer> head=null,tail=null,t1=head1,t2=head2;
	if(head1.data<head2.data) {
		head=head1;
		tail=head1;
		t1=t1.next;
	}else {
		head=head2;
		tail=head2;
	t2=t2.next;	
	}
	while(t1!=null && t2!=null) {
		if(t1.data<t2.data) {
			tail.next=t1;
			t1=t1.next;
			tail=tail.next;
			
		}else {
			tail.next=t2;
			t2=t2.next;
			tail=tail.next;
		}
	}
	if(t1!=null) {
		tail.next=t1;
	}else {
		tail.next=t2;
	}
	return head;
}
public void megeSOrt(LinkedListNode<Integer>head) {
if(head==null || head.next==null) {
	return ;
}
	dNode node=divide(head);
	megeSOrt(node.fnode);
	megeSOrt(node.snode);
	merge(node.fnode, node.snode);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//LinkedListNode<Node>head=
	}

}
