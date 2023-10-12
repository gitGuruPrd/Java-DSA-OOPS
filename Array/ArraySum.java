package Array;

public class ArraySum {

	public static int sum( int[]arr) {
		int add=0;
		int size=arr.length;
		arr=new int[size];
		
			for(int j=0;j<size;j++) {
				add+=arr[j];
				
			}
		
		return add;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
