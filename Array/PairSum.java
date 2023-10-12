package Array;

public class PairSum {
	public static int pairSum(int[]arr,int x) {
		int[] darr=arr;
		int count=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<darr.length;j++) {
//				if(i==j) {
//					continue;
//				}
//				int sum=arr[i]+darr[j];
//				if(sum==x) {
//					++count;
//					darr[j]=Integer.MIN_VALUE;
//					break;
//				}
//			}
//			
//		}
		for(int i=0;i<arr.length;i++) {
			int j=i+1;
			for(;j<arr.length;j++) {
				int sum =arr[i]+arr[j];
				if(sum==x) {
					++count;
				}
			}
			
		}
		
		
	return count;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr1= {1,3,5,6};
int x= 4;
System.out.println(pairSum(arr1, x));

	}

}
