package Stacks;

import java.util.Iterator;
import java.util.Stack;

public class StockSpan {
/*
 * Afzal has been working with an organization called 'Money Traders' for the past few years. The organization is into the money trading business. His manager assigned him a task. For a given array/list of stock's prices for N days, find the stock's span for each day.
The span of the stock's price today is defined as the maximum number of consecutive days(starting from today and going backwards) for which the price of the stock was less than today's price.
For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85], then the stock spans will be [1, 1, 1, 2, 1, 4, 6].
 */
	public static int[] stockSpan(int[] price) {
	int len=price.length;
		int[] ans=new int[len];
		ans[0]=1;
		Stack<Integer> st= new Stack<Integer>();
		st.push(0);
		for(int i=1;i<len;i++) {
			while(!st.isEmpty()&&price[st.peek()]<price[i]) {
				st.pop();
			}
			if(!st.isEmpty()) {
				ans[i]=i-st.peek();
			}else {
				ans[i]=i+1;
			}
			st.push(i);
		}
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] price= {10,20,30,5,8,12};
int[] ans=stockSpan(price);
for (int i : ans) {
	System.out.print(i+" ");
}
	}

}
