package recursion;

public class Multiplication {
	public static int multiplyTwoIntegers(int m,int n) {
		if(n==0) {
			return 0;
		}
		int out=m+multiplyTwoIntegers(m, n-1);
		return out;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(multiplyTwoIntegers(7, 5));
	}
	/*
	 * explanation :- 7*5=7+7+7+7+7
	 */

}
