package recursion;

public class Recursi0n {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int output = n*fact(n-1);
		return output;
	}
	public static boolean isSorted(int[] arr) {
		if(arr.length==1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}
		int[] smallArray = new int[arr.length-1];
		
		for(int i=1;i<arr.length;i++) {
			smallArray[i-1]=arr[i];
		}
		boolean isSorted=isSorted(smallArray);
		return isSorted;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=4;
System.out.println(fact(x));
int[]arr= {1,2,3,4,5};
System.out.println(isSorted(arr));
	}

}
