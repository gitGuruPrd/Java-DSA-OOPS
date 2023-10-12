package recursion;

public class BinarySearch {
public static int binarySearch(int arr[],int si,int ei, int ele) {
	if(si>ei) {
		return -1;
	}
	int midi=(si+ei)/2;
	if(arr[midi]==ele) {
		return midi;
	}else if (arr[midi]>ele) {
		return binarySearch(arr, si,midi-1, ele);
		
	}else{
		return binarySearch(arr, midi+1, ei, ele);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,2,4,5,7,9};
		System.out.println(binarySearch(arr, 0,arr.length-1, 7));
		
	}

}
