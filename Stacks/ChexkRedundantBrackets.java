package Stacks;

import java.util.Stack;

public class ChexkRedundantBrackets {
	public static boolean isRedundant(String expression) {
		boolean isred=false;
		int count=0;
		int len=expression.length();
		Stack<Character> st=new Stack<Character>();
	for(int i=0;i<len;i++) {
		if(expression.charAt(i)!=')') {
			st.push(expression.charAt(i));
		}else {
			count=0;
			while(st.pop()!='(') {
				count++;
				
			}
			if(count<=1) {
				return true;
			}
		}
	}
	
	return false;
		
		
		
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="(a+(b)+c)";
		System.out.println(isRedundant(exp));

	}

}
