package Linkedlist;

import java.util.Scanner;

//import javax.print.event.PrintJobAttributeListener;
class DoubleNode{
	Node<Integer>head;
	Node<Integer>tail;
	Node<Integer>nh;
	public DoubleNode() {
}
	public DoubleNode(Node<Integer>head,Node<Integer>tail,Node<Integer>nh) {
		this.head=head;
		this.tail=tail;
		this.nh=nh;
	}
	}
public class LinkedListTry {
	
	public static Node<Integer> createLinkedList() {
		Node<Integer> n1= new Node<Integer>(10);
//		System.out.println(n1.data);
//		Node <Integer>[] n =new Node[]<Integer>();
		Node <Integer> n2=new Node<Integer>(20);
		Node <Integer> n3=new Node<Integer>(20);
		Node <Integer> n4=new Node<Integer>(10);
		n2.next=n3;
		n3.next=n4;
		n1.next=n2;
		return n1;
	}
	public static Node<Integer> takeInput() {
		
		Scanner sc =new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer>head=null,tail=null;
		while(data!=-1) {
			Node<Integer>currentNode=new Node<Integer>(data);
			if(head==null) {
				head=currentNode;
				tail =currentNode;
			}else {
//				Node<Integer>tail=head;
//				while(tail.next!=null) {
//					tail=tail.next;
//				}
//				tail.next=currentNode;
				
				tail.next=currentNode;
				tail=currentNode;
			}
			data=sc.nextInt();			
		}
		return head;
		
	}
	public static void findElement(Node<Integer> head,int i) {
		/*if(i==0) {
			System.out.println(head.data);
			return;
		}*/
		Node temp=head;
		int count=0;
		
		while(temp!=null) {
		if(count==i) {
			System.out.println(temp.data);
			return;
		}
		count++;
		temp=temp.next;
		}
		System.out.println(-1);
		return;
		
	}
	public static void insert(Node<Integer> head, int pos, int data){
//	make before you break;
//	while(currNode.data!=-1) {
//		if(i==pos) {
//			Node<Integer> temp=lastNode.next;
//			temp.next=currNode;
//			temp.data=data;
//			
//			
//		}else {
//			i++;
//			lastNode=currNode;
//			currNode=currNode.next;
//		}
//	}
		Node<Integer> node= new Node<Integer>(data);
		Node<Integer> prev = head;
		int count=0;
		while (count<pos-1) {
			count++;
			prev=prev.next;
			
		}
		node.next=prev.next;
		prev.next=node;
		
		
	}
	public static Node<Integer> delete(Node<Integer> head,int pos) {
//	make before you break and return type should be a node so that head is updated in main also	
		int count=0;
		Node<Integer>prev=head;
		if(head==null) {
			return head;
		}
	if(pos==0) {
		head=head.next;
		return head;
	}
	while(count<pos-1&&prev.next.next!=null) {
		count++;
		prev=prev.next;
	}
	if(count==pos-1) {
		prev.next=prev.next.next;
		return head;
	}else if(prev.next.next==null){
		prev.next=null;
		return head;
	}else {
		return head;
	}
		
	}
	public static void increment(Node<Integer>head) {
		while(head!=null) {head.data++;
		head=head.next;
		}
		
	}
	public static void printList(Node<Integer>head) {
		Node<Integer> temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"\t");
		temp=temp.next;
	}
	}
	public static Node<Integer> appendLastNToFirst(Node<Integer> head,int n) {
//		Node<Integer>tail=head;
//		Node<Integer>temp=head;
//		int count=0;
//		while(tail.next.next!=null) {
//			tail=tail.next;
//		}
//		if(tail==head) {
//			return head;
//		}
//		while(count<n) {
//			tail.next=temp;
//			temp.next=head;
//			head=temp;
//			count++;
//		}
//		return head;
		if(n!=0){
			Node<Integer>tail=head,temp=head;
			int countEle=1;
			if(head==null){
				return head;
			}
			while(temp.next!=null){
				temp=temp.next;
				countEle++;

			}
			tail=temp;
			tail.next=head;
			temp=head;
			int i=countEle-n;
			while(i>1){
				temp=temp.next;
				i--;
			}
			head=temp.next;
			temp.next=null;
			return head;


			}else{

			return head;
			}
		}
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
//		== doesnt for conflicting variables for that .equals() method has to be used
		if(head==null || head.next==null){
			return head;
		}
		Node<Integer>temp=head;
		
			while(temp!=null&&temp.next!=null){
				if(temp.data.equals(temp.next.data)){
					temp.next=temp.next.next;
				}
				else{
					temp= temp.next;
				}
			}
		return head;
		}
		
	public static void reverseNode(Node<Integer> head) {
//		this method is using recursion
		
		if(head==null) {
			return;
		}
		reverseNode(head.next);
		System.out.print(head.data);
		
		
	}
public static Node<Integer> reverseList(Node<Integer>head) {
	if(head==null||head.next==null) {
		return head;
	}
	Node<Integer>tail=head.next;
	Node<Integer>ans=reverseList(head.next);
	tail.next=head;
	head.next=null;
	return ans;
	
}
	public static boolean isPallindrome(Node<Integer> head) {
		boolean ispal=true;
		Node<Integer>temp=head,newHead=head;
		int len= 0;
		while(temp.next!=null) {
			temp=temp.next;
		len++;
		}
		int len2= len/2;
		temp= head;
		while(len2>0) {
			temp=temp.next;
			len2--;
		}
		newHead=temp.next;
		temp=head;
		newHead=reverseList(newHead);
		len2=len/2;
		while(newHead!=null&&len2>-1) {
			if(!temp.data.equals(newHead.data)) {
			ispal=false;
			return ispal;
			}
			temp=temp.next;
			newHead=newHead.next;
			
			
			len2--;
		}
		
		return ispal;
	}
	public static Node<Integer> insertRecus(Node<Integer> head,int ele,int pos) {
		if(head==null && pos>0) {
			return head;
		}
		
		
		if(pos==0) {
			Node<Integer> newNode=new Node<Integer>(ele);
			newNode.next=head;
			return newNode;
		}else {
			head.next=insertRecus(head.next, ele, pos-1);
			return head;
		}
	}
	public static Node<Integer> deleteRecur(Node<Integer>head,int pos) {
		if(head==null && pos>0) {
			return head;
		}
		if(pos==0) {
			return head.next;
		}else {
			head.next=delete(head.next, pos-1);
			return head;
		}
		
	}
	public static Node<Integer> reverseHeadRecursively(Node<Integer>head) {
		if(head==null||head.next==null) {
			return head;
		}


		Node<Integer> reverseHead= reverseHeadRecursively(head.next);
		Node<Integer>tail=head;
		while(tail.next!=null) {
			tail=tail.next;
		}
		tail.next=head;
		
		head.next=null;
		return reverseHead;
		
		
		
	}
	public static DoubleNode reverseListBetter(Node<Integer> head) {
		DoubleNode ans;
		if(head==null||head.next==null) {
			 ans= new DoubleNode(head,head);
			return ans;
		}
		DoubleNode smallAns= reverseListBetter(head.next);
		smallAns.tail.next=head;
		head.next=null;
		ans=new DoubleNode(smallAns.head,head);
		return ans;
	}
	public static Node<Integer> midNode(Node<Integer>head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node<Integer> slow=head,fast=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public static Node<Integer> mergeList(Node<Integer>head1,Node<Integer>head2) {
		if(head1==null||head2==null) {
			if(head1==null) {
				return head2;
			}else {
				return head1;
			}
			}Node<Integer>head=(head1.data<head2.data)?head1:head2;
		Node<Integer>tail;
		Node<Integer>temp1=head1,temp2=head2;
        if(head1.data<head2.data){
            head=head1;
            tail=head1;
        temp1=temp1.next;
        }else{
            head=head2;
            tail=head2;
        temp2=temp2.next;
        }
        // head.next=tail;
		while(temp1!=null&&temp2!=null){
		if(temp1.data<temp2.data) {
		tail.next=temp1	;
		temp1=temp1.next;
		tail=tail.next;
		}else {
			tail.next=temp2;
			temp2=temp2.next;
			tail=tail.next;
		}
		
		}
		if(temp1!=null) {
			tail.next=temp1;
		}else {
			tail.next=temp2;
		}
		/*while(temp1!=null) {
			tail.next=temp1;
			temp1=temp1.next;
			tail=tail.next;
		}
		while(temp2!=null) {
			tail.next=temp2;
			temp2=temp2.next;
			tail=tail.next;
		}*/
		
		return head;
		
	}
	public static Node<Integer> mergeSort(Node<Integer>head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer>mid=midNode(head);
		Node<Integer>nHead=mid.next;
		mid.next=null;
		Node<Integer> head1=mergeSort(head);
		Node<Integer> head2=mergeSort(nHead);
		Node<Integer>ans=mergeList(head1, head2);
		return ans;
		
	}
	public static int findNodeRec(Node<Integer>head,int n) {
		if(head==null) {
			return -1;}
	int index=findNodeRec(head.next, n);
	if(head.data==n) {
		return index;
	}else {
		index++;
		return index;
	}
	}
	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node<Integer>eh=null,et=null,oh=null,ot=null,tp=head;
		while(tp!=null) {
		if(	tp.data%2==0) {
			if(eh==null) {
				eh=tp;
				et=eh;
			}else {
				et.next=tp;
				et=et.next;
				et.next=null;
			}
		}else {
			if(oh==null) {
				oh=tp;
				ot=oh;
			}else {
				ot.next=tp;
				ot=ot.next;
				ot.next=null;
			}
			
		}
		tp=tp.next;
		}
		if(oh==null) {
			return head;
		}else {
			ot.next=eh;
		}
		head=oh;
		return oh;
		
	}
	public static Node<Integer> swap(Node<Integer> head,int i,int j) {
		if(head==null || head.next==null || i==j) {
			return head;
		}
		Node<Integer>c1=head,p1=head,c2=head,p2=head,tp=head;
		int n=(i>j)?i:j;
		int m=(n==i)?j:i;
		while(tp!=null) 
		{
			if(m!=0)
			{
			p1=c1;
			c1=c1.next;
			m--;
			}
			
			p2=c2;
			c2=c2.next;
			tp=tp.next;
			n--;
			if(n==0) {
				break;
			}
			
			
		}
		c1.next=c2.next;//1
		p1.next=c2;
		c2.next=p2;
		p2.next=c1;
		return head;
		
		
		
	}
	public static DoubleNode traverse(Node<Integer>head,int k) {
		DoubleNode ans;
		if(head==null||head.next==null) {
			ans= new DoubleNode(head,head,null);
			return ans;
		}
		Node<Integer> t=head;
		while(t.next!=null && k!=0) {
			t=t.next;
			k--;
			
		}
		
		if(t.next==null&&k!=0) {
			
			ans=new DoubleNode(head,head,null);
			return ans;
		}
		if(t.next==null){
			ans=new DoubleNode(head,t,null);
		}else {
			
			ans=new DoubleNode(head,t,t.next);
			ans.tail.next=null;
			return ans;
		}
		return ans;
		
	}
	public static Node<Integer> kreverse(Node<Integer> head, int k) {
//		public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
			//Your code goes here
	       if(k==0 || k==1) {
	    	   return head;
	       }
	       Node<Integer>curr=head;
	       Node<Integer>prev=null;
	       Node<Integer>fwd=null;
	       int count =0;
	       while(count<k&&curr!=null) {
	    	   fwd=curr.next;
	    	   curr.next=prev;
	    	   curr=fwd;
	    	   count++;
	    	   
	       }
	       if(fwd!=null) {
	    	   head.next=kreverse(fwd, k);
	       }
	       return prev;
		
	}
	public static Node<Integer> bubbleSort(Node<Integer> head) {
		if(head==null || head.next==null){
			return head;
		}

		Node<Integer> c=head,p=null,f=null,t=head;
		int count=1;
		while(t!=null){
			t=t.next;
			count++;
		}
		int ln=count;
		for(int i=ln;i>1;i--){
			int j=i;
			c=head;
			p=null;
			f=null;
			while(j>1 && c.next!=null)
			{
				if(c.data>(Integer)c.next.data){
					f=c.next;
					c.next=f.next;
					f.next=c;
					if(p==null){
						head=f;
					}else{
						p.next=f;
					}
					p=f;
				}else{
				
					p=c;
					c=c.next;

				}
				j--;

			}

		}

		return head;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head=  takeInput() ;
		head=evenAfterOdd(head);
		printList(head);
//		Node<Integer> head2=  createLinkedList() ;

//		increment(head);
		
//		;
//		head=removeDuplicates(head);//if head is not updated answer will be wrong
//		head=appendLastNToFirst(head, 2);
		//if head is not updated answer will be wrong
//		reverseNode(head);
//		  head=insertRecus(head, 5, 1);
//		  printList(head);
//		  head=deleteRecur(head, 2);
//		   head=reverseHeadRecursively(head);
//		DoubleNode ans=reverseListBetter(head);
//		System.out.println(midNode(head).data);
//		Node<Integer> head3=mergeList(head, head2);
		
//		  printList(head3);
//		System.out.println(isPallindrome(head));
//		head=reverseList(head);
		
//		Node<Integer>headNew=mergeSort(head2);
//		printList(headNew);
		
		
		
		
	}

}
