package Stacks;

import java.util.Stack;

import OOPs.constructor;

public class ReverseMinimumBracket {
	public static int countBracketReversals(String input) {
		if(input.length()%2!=0) {
			return -1;
		}
		Stack<Character> st= new Stack<Character>();
		int l=input.length();
		int count=0;
//		
		for(int i=0;i<l;i++) {
			if(input.charAt(i)=='{') {
				st.push(input.charAt(i));
			}else {
				if(st.isEmpty()) {
					st.push(input.charAt(i));
					
				}else if(st.peek()!='{') {
					st.push(input.charAt(i));
				}else {
					st.pop();
				}
				
				
			}
		}
		if(!st.isEmpty()) {
			if(st.size()%2!=0) {
				return -1;
			}
			while(st.size()!=0) {
				char c1=st.pop();
				char c2=st.pop();
				if(c1!=c2 && c2=='{') {
				continue;
				}else if(c1==c2 && c2=='{') {
					count++;
				}else if(c1==c2 && c1=='}'){
					count++;
				}else {
					count+=2;
				}
				
			}
		}
		
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="}}}}{{{{";
		System.out.println(countBracketReversals(input));

	}

}
