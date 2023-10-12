package BinaryTrees;
class BSTDeleteReturn{
	Btree<Integer> root;
	boolean deleted;
	public BSTDeleteReturn(Btree<Integer> root,boolean deleted) {
		this.deleted=deleted;
		this.root=root;
	}
}

public class BST {
private Btree<Integer> root;
private int size;
private static boolean isPresentHelper(Btree<Integer>node,int x) {
	if(node==null ) {
		return false;
	}
	if(node.data==x) {
		return true;
	}
	if(node.data>x) {
		return isPresentHelper(node.left,x);
	}else {
		return isPresentHelper(node.right, x);
	}
}
public  boolean isPresent(int x) {
	return isPresentHelper(root, x);
}
public static Btree<Integer> insert(Btree<Integer>node,int data){
	if(node==null) {
		node=new Btree<Integer>(data);
		return node;
	}
	if(data>=node.data) {
		node.right=insert(node.right, data);
		
	}else {
		node.left=insert(node.left, data);
		
	}
	return node;
}
public void insert(int x) {
	root=insert(root, x);
	size++;
	return;
}
public static int minimum(Btree<Integer>node) {
	if(node==null) {
		return Integer.MAX_VALUE;
	}
	int leftMin=minimum(node.left);
	int rightMin= minimum(node.right);
	return Math.min(node.data,Math.min(leftMin, rightMin));
}
private static BSTDeleteReturn deleteHelp(Btree<Integer> node,int x) {
	if(node==null) {
		return new BSTDeleteReturn(null, false);
	}
	if(node.data<x) {
		BSTDeleteReturn rightRet=deleteHelp(node.right, x);
		node.right=rightRet.root;
		rightRet.root=node;
		return rightRet;
		
	}
	if(node.data>x) {
		BSTDeleteReturn leftRet=deleteHelp(node.left, x);
		node.left=leftRet.root;
		leftRet.root=node;
		return leftRet;
		
	}
//	0 children
	if(node.left==null && node.right==null) {
		return new BSTDeleteReturn(null, true);
	}
//	1 child
	if(node.left!=null && node.right ==null) {
		return new BSTDeleteReturn(node.left, true);
	}
	if(node.left==null && node.right !=null) {
		return new BSTDeleteReturn(node.right, true);
	}
//	both child-> either left max or right minimum;
	int rightMin=minimum(node.right);
	node.data=rightMin;
	BSTDeleteReturn output= deleteHelp(node.right,rightMin);
	node.right=output.root;
	return new BSTDeleteReturn(node.right, true);
	
}
public boolean deleteData(int x) {
BSTDeleteReturn output=deleteHelp(root, x);
if(output.deleted) {
	size--;

}
return output.deleted;
}
public int size() {
	return size;
}
private static void printTreeHelper(Btree<Integer> node) {
	if(node==null) {
		return;
		
	}
	System.out.print(node.data+": ");
	if(node.left!=null) {
		System.out.print("L"+(Integer)node.left.data);
	}
	if(node.right!=null) {
		System.out.print(","+"R"+(Integer)node.right.data);
	}
	System.out.println();
	printTreeHelper(node.left);
	printTreeHelper(node.right);
}
public void printTree() {
	printTreeHelper(root);
}
}
