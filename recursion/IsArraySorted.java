package recursion;

public class IsArraySorted {
public static boolean isASorted(int[] arr,int si) {
	if(si==arr.length-1) {
		return true;
	}
	if(arr[si]>arr[si+1]) {
		return false;
	}
	boolean output=isASorted(arr,si+1);
	return output;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {1,2,3,4,5};
System.out.println(isASorted(arr,0));
	}

}
