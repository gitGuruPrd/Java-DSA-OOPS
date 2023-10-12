package Stacks;

import java.util.Stack;

public class CollectionsStack {
	public static void reverseStack(Stack<Integer> input,Stack<Integer>extra) {
		if(input.isEmpty()) {
			return;
		}
		// input.push(extra.pop());
		// keep temp with u
		int temp=input.pop();
		// call recursion assuming it will reverse the stack
		reverseStack(input, extra);
		// put elements of reversed stack in helper stack
		while(!input.isEmpty()){
		extra.push(input.pop());
		}
		// push temp and other elements above it using helper stack
		input.push(temp);
		while(!extra.isEmpty()){
			input.push(extra.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> kcats=new Stack<Integer>();
for(int i=0;i<5;i++) {
	kcats.push(i+10);
}
//System.out.println(kcats.peek());
Stack<Integer>helper=new Stack<Integer>();
reverseStack(kcats, helper);
for (int i : kcats) {
	System.out.print(i+" ");
}

	}

}
