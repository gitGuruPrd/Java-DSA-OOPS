package recursion;
/*
 * A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.
 */
public class StairCase {
	
public static int stairCase(int n) {
	if(n==0) {
		return 1;
	}else if(n<0) {
		return 0;
	}
	int a=stairCase(n-1);
	int b=stairCase(n-2);
	int c=stairCase(n-3);
	return a+b+c;

	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stairCase(5));
	}

}
