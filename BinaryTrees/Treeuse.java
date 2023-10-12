package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Pair<T,U>{
	T minimum;
	U maximum;
	public Pair(T minmum,U maximum) {
		this.maximum=maximum;
		this.minimum=minimum;
		
	}
	public void print() {
		System.out.println(minimum+" "+maximum);
	}
}
class BstReturn {
	int min;
	int max;
	boolean isBst;
	public BstReturn(int min,int max,boolean isBst) {
		this.isBst=isBst;
		this.min=min;
		this.max=max;
	}
}
class check{
	boolean isleaf;
	int sum;
	public check(int sum,boolean isleaf) {
		this.isleaf=isleaf;
		this.sum=sum;
	}
}
public class Treeuse {
	public static Btree<Integer> takeinput(){
		System.out.println("Enter root data:");
		Scanner sc= new Scanner(System.in);
		int rootdata= sc.nextInt();
		if(rootdata==-1) {
			return null;
		}
		Btree<Integer> root=new Btree<Integer>(rootdata);
		root.left=takeinput();
		root.right=takeinput();
		return root;
				
		
	}
	public static Btree takeInputBetter(boolean isRoot,boolean isLeft,int parent) {
		if(isRoot) {
			System.out.println("Enter root data:");
		}else {
			if(isLeft) {
				System.out.println("Enter left Child of:"+" "+parent);
			}else {
				System.out.println("Enter right child of:"+" "+parent);
			}
		}
		Scanner sc = new Scanner(System.in);
		int rootdata=sc.nextInt();
		if(rootdata==-1) {
			return null;
		}
		Btree<Integer> root=new Btree<Integer>(rootdata);
		root.left=takeInputBetter(false,true,rootdata);
		root.right=takeInputBetter(false, false, rootdata);
		return root;
	}
	public static int numNodes(Btree<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftnodes=numNodes(root.left);
		int rightNodes=numNodes(root.right);
		return 1+leftnodes+rightNodes;
	}
	public static void printTree(Btree<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+ " ");
		printTree(root.left);
		printTree(root.right);
	}
	public static void printTreeDetailed(Btree<Integer> root) {
		if(root==null) {
			return;
			
		}
		System.out.print(root.data+": ");
		if(root.left!=null) {
			System.out.print("L"+(Integer)root.left.data);
		}
		if(root.right!=null) {
			System.out.print(","+"R"+(Integer)root.right.data);
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	public static void postOrder(Btree<Integer> root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
public static int lasgest(Btree<Integer> root) {
if(root==null) {
	return -1;
}
	int leftdata=lasgest(root.left);
	int rightdata = lasgest(root.right);
	int max1= Math.max(leftdata, rightdata);
	int max2=Math.max(root.data, max1);
	return max2;
}
public static int noLeafs(Btree<Integer> root) {
	if(root==null) {
		return 0;
	}
	int left=noLeafs(root.left);
	int right=noLeafs(root.right);
	int count=0;
	if(root.left==null&&root.right==null) {
		count++;
	}
	return left+right+count;
}
public static void depthAtnode(Btree<Integer>root, int k) {
	if(root==null) {
		return;
	}
	root.data=k;
	depthAtnode(root.left, k+1);
	depthAtnode(root.right, k+1);
}
public static boolean isNodePresent(Btree<Integer> root, int x) {
    //Your code goes here
	if(root==null){
		return false;
	}
	if(root.data==x){
		return true;
	}
	boolean inleft=isNodePresent(root.left, x);
	boolean inRight=isNodePresent(root.right, x);
	return (inleft||inRight);

}
public static Btree<Integer> removeLeaves(Btree<Integer> root){
	if(root==null) {
		return null;
	}
	if(root.left==null && root.right==null) {
		return null;
	}
	root.right=removeLeaves(root.right);
	root.left=removeLeaves(root.left);
	return root;
}
public static void mirrorTheTree(Btree<Integer> root) {
	if(root==null) {
		return;
	}
	Btree<Integer> temp=root.left;
	root.left=root.right;
	root.right=temp;
	mirrorTheTree(root.left);
	mirrorTheTree(root.right);
}
public static  boolean isBalanced(Btree<Integer> root) {
	if(root ==null) {
		return true;
	}
	int leftht=height(root.left);
	int rightht=height(root.right);
	boolean isleftBal=isBalanced(root.left);
	boolean isrightBal=isBalanced(root.right);
	if(Math.abs(rightht-leftht)>1) {
		return false;
	}
	return isleftBal && isrightBal;
}
	private static int height(Btree<Integer> root) {
	// TODO Auto-generated method stub
		if(root==null) {
			return 0;
		}
		int leftHt=1+height(root.left);
		int rightHt=1+height(root.right);
		return Math.max(leftHt, rightHt);
//	return 0;
}
	public static BalancedTreeReturn isBalancedBetter(Btree<Integer> root) {
		if(root==null) {
		BalancedTreeReturn out=new BalancedTreeReturn();
		out.height=0;
		out.isBal=true;
		return out;
		}
		BalancedTreeReturn leftSide= isBalancedBetter(root.left);
		BalancedTreeReturn rightSide=isBalancedBetter(root.right);
		boolean isBal=true;
		int height=1+Math.max(leftSide.height,rightSide.height);
		if(Math.abs(leftSide.height-rightSide.height)>1) {
			isBal=false;
			
		}
		if(!leftSide.isBal ||!rightSide.isBal) {
			isBal=false;
		}
		BalancedTreeReturn ans=new BalancedTreeReturn();
		ans.height=height;
		ans.isBal=isBal;
		return ans;
		
		
	}
	public static int diameterOfTree(Btree<Integer> root) {
//		diameter is defined as distance between two farthest node
		if(root==null) {
			return 0;
		}
		
	}
	public static Btree<Integer> takeInputLevelWise() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root data: ");
		int rootdata=sc.nextInt();
		if(rootdata==-1) {
			return null;
		}
		Queue<Btree<Integer>> pendingChildren= new LinkedList<Btree<Integer>>();
		Btree<Integer> root=new Btree<Integer>(rootdata);
		pendingChildren.add(root);
		while(!pendingChildren.isEmpty()) {
			Btree<Integer>front=pendingChildren.poll();
			System.out.println("enter the left child of "+front.data);
			
			int data=sc.nextInt();
			if(data!=-1) {
				Btree<Integer>leftchild=new Btree<Integer>(data);
				front.left=leftchild;
				pendingChildren.add(leftchild);
				
			}
			System.out.println("Enter the right child of "+front.data);
			data=sc.nextInt();
			if(data!=-1) {
				Btree<Integer> rightchild=new Btree<Integer>(data);
				front.right=rightchild;
				pendingChildren.add(rightchild);
			}
		}
		return root;
			
		
	}
	public static void printLevelWise(Btree<Integer> root) {
		//Your code goes here
		if(root==null){
			System.out.println(-1+":L:"+-1+",R:" + -1);

			return;
		}
		Queue<Btree>children=new LinkedList<Btree>();
		children.add(root);
		while(!children.isEmpty()){
			Btree<Integer> front=children.poll();
			System.out.print(front.data+":");
			if(front.left!=null){
				children.add(front.left);
				System.out.print("L:"+front.left.data);
			}else{
				System.out.print("L:"+ -1);
			}
			if(front.right!=null){
				children.add(front.right);
				System.out.print(",R:"+front.right.data);
			}else{
				System.out.print(",R:"+ -1);
			}
			System.out.println();
		}


	}
	public static Btree<Integer> buildTree(int[] pre,int[]in){
//		we have to build a binary tree using inorder and preorder values of tree
//		Assumption:- all elements are unique
		Btree<Integer>root=helperBuildTree(pre, in, 0, pre.length-1, 0, in.length-1);
		return root;
		
	}
	public static Btree<Integer> helperBuildTree(int[] pre,int[] in,int siPre,int eiPre,int siIn,int eiIn){
		if(siPre>eiPre) {
			return null;
		}
		int rootdata = pre[siPre];
		Btree<Integer> root= new Btree<Integer>(rootdata);
		int rootIndex=-1;
		for(int i=siIn;i<=eiIn;i++) {
			if(in[i]==rootdata) {
				rootIndex=i;
				break;
			}
		}
		int siPreleft=siPre+1;
		int siInleft=siIn;
		int eiInleft=rootIndex-1;
		int eiInright=eiIn;
		int siInright=rootIndex+1;
		int leftsubtreelength=eiInleft-siInleft+1;
		int eiPreright=eiPre;
		int eiPreleft=siPreleft+leftsubtreelength-1;
		int siPreright=eiPreleft+1;
		
		Btree<Integer> left=helperBuildTree(pre, in, siPreleft, eiPreleft, siInleft, eiInleft);
		Btree<Integer> right=helperBuildTree(pre, in, siPreright, eiPreright, siInright, eiInright);
		root.right=right;
		root.left=left;
		return root;
	}
	public static Btree<Integer> buildTreeInPo(int[]Po,int[]In){
		Btree<Integer> root=helper2InPo(Po, In, 0, Po.length-1, 0, In.length-1);
		return root;
	}
	public static Btree<Integer> helper2InPo(int[] Po,int[] In,int siPo,int eiPo,int siIn,int eiIn){
		if(siPo>eiPo) {
			return null;
		}
		int rootData=Po[eiPo];
		Btree<Integer> root= new Btree<Integer>(rootData);
		int rootIndex=-1;
		for(int i=siIn;i<=eiIn;i++) {
			if(In[i]==rootData) {
				rootIndex=i;
				break;
			}
		}
		int siPoLeft=siPo;
		int siInLeft=siIn;
		int eiInLeft=rootIndex-1;
		int eiPoRight=eiPo-1;
		int siInRight=rootIndex+1;
		int eiInRight=eiIn;
		int lengthofLeftSubtree=eiInLeft-siInLeft+1;
		int eiPoLeft=siPoLeft+lengthofLeftSubtree-1;
		int siPoRight=eiPoLeft+1;
		Btree<Integer> left= helper2InPo(Po, In, siPoLeft, eiPoLeft, siInLeft, eiInLeft);
		Btree<Integer> right= helper2InPo(Po, In, siPoRight, eiPoRight, siInRight, eiInRight);
		root.left=left;
		root.right=right;
		
		return root;
		
	}
	public static void insertDuplicate(Btree<Integer> root) {
		if(root==null) {
			return;
		}
		insertDuplicate(root.left);
		insertDuplicate(root.right);
		Btree<Integer> duplicate= new Btree<Integer>(root.data);
		duplicate.left=root.left;
		root.left=duplicate;
	}
	public static Pair<Integer, Integer> getMinAndMax(Btree<Integer> root) {
		//Your code goes here
		if(root==null){
			return new Pair(Integer.MAX_VALUE,Integer.MIN_VALUE);
		}
		Pair<Integer,Integer> ans= new Pair(root.data,root.data);
		Pair<Integer,Integer> left=getMinAndMax(root.left);
		Pair<Integer,Integer> right=getMinAndMax(root.right);
		ans.minimum=Math.min(ans.minimum,Math.min(left.minimum,right.minimum));
		ans.maximum=Math.max(ans.maximum,Math.max(left.maximum,right.maximum));
		return ans;
	}
	public static void printLevelWiseNewLine(Btree<Integer> root) {
		//Your code goes here
		if(root==null){
			return;
		}
		// Queue<BinaryTreeNode> parent= new LinkedList<BinaryTreeNode>();
		// parent.add(root);
		// if(root.left!=null){
		// 	child.add(root.left);
		// }
		// if(root.right!=null){
		// 	child.add(root.right);
		// }
		Queue<Btree> child= new LinkedList<Btree>();
		child.add(root);
		child.add(null);
		while(!child.isEmpty()) {
			Btree<Integer> front= child.poll();
			if(front==null) {
				if(child.isEmpty()) {
					return;
				}
				System.out.println();
				child.add(null);
				front=child.poll();
			}
			System.out.print(front.data+" ");
			if(front.left!=null) {
				child.add(front.left);
			}
			if(front.right!=null) {
				child.add(front.right);
			}
		}
		

	
		
		
	}

	
	public static void rootToLeafPathsSumToK(Btree<Integer> root, int k,String str)
	{
	if(root == null ) {
		return;
	}
		if(root.right==null && root.left==null && root.data==k) {
			System.out.println(str+root.data);
}
		str=str+root.data+" ";
		rootToLeafPathsSumToK(root.left, k-root.data, str);
		rootToLeafPathsSumToK(root.right, k-root.data, str);
		
		
    }
	public static void nodesAtDist(Btree<Integer>root,int node,int k,int dist,int rd) {
		if(root==null) {
			return;
		}
		if(node==root.data) {
			rd=dist;
		}
		int abs= Math.abs(dist-rd);
		if(abs==k) {
			System.out.println(root.data);
		}
		nodesAtDist(root.left, node, k, dist+1, rd);
		nodesAtDist(root.right, node, k, dist+1, rd);
	}
	public static void printNodeAtK(Btree<Integer>root,int k) {
		if(root==null||k<0) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
			
		}
		printNodeAtK(root.left, k-1);
		printNodeAtK(root.right, k-1);
	}
	int printNode(Btree<Integer>root,int node,int k) {
		if(root==null) {
			return -1;
		}
		if(root.data==node) {
			printNodeAtK(root, k);
			return 0;
		}
		int ld=printNode(root.left, node, k);
		if(ld!=-1) {
			if(ld+1==k) {
				System.out.println(root.data);
			}else {
				printNodeAtK(root.right, k-ld-2);
				return ld+1;
			}
		}
		int rd = printNode(root.right, node, k);
		if(rd!=-1) {
			if(rd+1==k) {
				System.out.println(root.data);
			}else {
				printNodeAtK(root.right, k-rd-2);
				return rd+1;
			}
		}
		return -1;
	}
	public static boolean searchInBST(Btree<Integer> root, int k) {
		if(root==null){
			return false;
		}
		if(root.data==k){
			return true;
		}
	if(root.data>k){
		boolean left=searchInBST(root.left, k);
		return left;
	}else{
		return searchInBST(root.right, k);
	}
	}
	public static void elementsInRangeK1K2(Btree<Integer> root,int k1,int k2){
		if(root==null){
			return;
		}
//		if(root.data>=k1){
//			elementsInRangeK1K2(root.left, k1, k2);
//			if(root.data<=k2){
//				System.out.print(root.data+" ");
//			}
//			elementsInRangeK1K2(root.right, k1, k2);
//		}else{
//			elementsInRangeK1K2(root.right, k1, k2);
//		}
		if(root.data<k1) {
			elementsInRangeK1K2(root.right, k1, k2);
		}else if(root.data>k2) {
			elementsInRangeK1K2(root.left, k1, k2);
		}else {
			System.out.print(root.data+" ");
			elementsInRangeK1K2(root.left, k1, k2);
			elementsInRangeK1K2(root.right, k1, k2);
		}
	
	}
	public static int minimum(Btree<Integer>root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		int leftMin=minimum(root.left);
		int rightMin= minimum(root.right);
		return Math.min(root.data,Math.min(leftMin, rightMin));
	}
	public static int largest(Btree<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int largestLeft=largest(root.left);
		int LargestRIGHT=largest(root.right);
		return Math.max(root.data,Math.max(largestLeft, LargestRIGHT));
	}
	public static boolean isBST(Btree<Integer> root) {
		if(root==null) {
			return true;
		}
		int leftMax=largest(root.left);
		if(leftMax>=root.data) {
			return true;
		}
		int rightMin=minimum(root.right);
		if(rightMin<root.data) {
			return false;
		}
		boolean isLeftBst=isBST(root.left);
		boolean isRightBst=isBST(root.right);
		return isLeftBst&&isRightBst;
	}
	public static BstReturn isBst(Btree<Integer>root) {
		if(root==null) {
			return new BstReturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
		}
		BstReturn left=isBst(root.left);
		BstReturn right=isBst(root.right);
		int min = Math.min(root.data,Math.min(left.min,right.min));
		int max= Math.max(root.data,Math.max(left.max, right.max));
		boolean isBst=true;
		if(left.max>=root.data) {
			isBst=false;
		}
		if(right.min<root.data) {
			isBst=false;
		}
		if(!left.isBst) {
			isBst=false;
		}
		if(!right.isBst) {
			isBst=false;
		}
		BstReturn ans= new BstReturn(min, max, isBst);
		return ans;
		
	}
	public static boolean isBst3(Btree<Integer> root,int minrange,int maxrange) {
		if(root==null) {
			return true;
		}
		if(root.data<minrange || root.data>maxrange) {
			return false;
		}
		boolean isLeftWithinRange=isBst3(root.left, minrange, maxrange)
	}
	public static ArrayList<Integer> nodeToRootPath(Btree<Integer> root,int x){
		if(root==null) {
			return null;
		}
		if(root.data==x) {
			ArrayList<Integer> op=new ArrayList<Integer>();
			op.add(root.data);
			return op;
		}
		ArrayList<Integer> leftop=nodeToRootPath(root.left, x);
		if(leftop!=null) {
			leftop.add(root.data);
			return leftop;
		}
		ArrayList<Integer> rightop=nodeToRootPath(root.right, x);
		if(rightop!=null) {
			rightop.add(root.data);
			return rightop;
		}
		return null;
	}
//	public static void nodesAtDistance(Btree<Integer>root,int node,)
	public static void main(String[] args) {
//	Btree<Integer> root = new Btree<Integer>(1);
//	Btree<Integer> rootLeft = new Btree<Integer>(2);
//	Btree<Integer> rootRight = new Btree<Integer>(3);
//	root.left=rootLeft;
//	root.right=rootRight;
//	Btree<Integer> leaf1 = new Btree<Integer>(4);
//	Btree<Integer> leaf2 = new Btree<Integer>(6);
//	rootLeft.left=leaf1;
//	rootRight.right=leaf2;
////	printTree(root);
//	printTreeDetailed(root);
//		Btree<Integer> root=takeInputBetter(true,false,0);
//		postOrder(root);
//		System.out.println("num of nodes : "+ numNodes(root));
//		System.out.println(noLeafs(root));
//		depthAtnode(root, 0);
//		System.out.println(isNodePresent(root, 4));
//		Btree<Integer> newRoot= removeLeaves(root);
//		mirrorTheTree(root);
//		System.out.println(isBalanced(root)+" "+height(root));
//		BalancedTreeReturn ans=isBalancedBetter(root);
//		System.out.println(ans.height+" "+ans.isBal);
//		printTreeDetailed(root);
//		Btree<Integer> root= takeInputLevelWise();
////		printTreeDetailed(root);
//		printLevelWise(root);
		int[] pre= {2,3,4,4,8,9,2,6};
		int[] in= {4,4,3,8,2,2,6,9};
//		int[] Po= {4,5,2,3,1};
		Btree<Integer> root=buildTree(pre,in);
//		String sc="";
//		rootToLeafPathsSumToK(root, 13,sc);
//		System.out.println(sc);
//		printLevelWiseNewLine(root);
//		Btree<Integer> root=buildTreeInPo(Po, in);
		nodesAtDist(root, 2, 2, 0,Integer.MAX_VALUE);
		printTreeDetailed(root);
		
//		insertDuplicate(root);
//		printLevelWise(root);
//		Pair<Integer,Integer> pair=getMinAndMax(root);
//		pair.print();
		
	}

}
//2 4 5 6 -1 -1 7 20 30 80 90 -1 -1 -1 -1 -1 -1 -1 -1
//8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
