package Array;

public class SecondLargest {
	public static int secondLargest(int[]arr) {
		if(arr.length<=0)
			return Integer.MIN_VALUE;
		int i=0,count=0;
		int max=Integer.MIN_VALUE;
while(i+1<arr.length) {
	if(arr[i]>max) {
		max=arr[i];
		count++;
	}
}

		return arr[count-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {1,2,3,4,55,5,6};
System.out.println(secondLargest(arr));
	}

}
