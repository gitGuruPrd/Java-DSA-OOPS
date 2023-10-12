package Array;

public class BinarySearch {
	public static int binarySearch(int[] arr,int x) {
		int start,end,mid;
		start=0;
		end=arr.length-1;
		int index=-1;
		while(start<=end) {
			 mid=(start+end)/2;
			 if(arr[mid]>x) {
				 end=mid-1;
			 }else if(arr[mid]<x) {
				 start=mid+1;
			 }else {
				 return mid;
			 }
			 
			 }
		return index;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start ,end,mid;
		int[] arr= {1,5,8,9,10,13,14};
		System.out.println(binarySearch(arr, 8));
		
	}

}
