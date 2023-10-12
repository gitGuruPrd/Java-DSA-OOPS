package Array;

public class TripletSum {
	public static int pairSum(int[]arr,int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
				
				for(int j=i+1;j<arr.length;j++) {
					for(int k=j+1;k<arr.length;k++) {
				int sum=arr[i]+arr[j]+arr[k];
				if(sum==x) {
					++count;
				}
			}}
		}
		
		
	return count;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr1= {1,3,5,6};
int x= 9;
System.out.println(pairSum(arr1, x));

	}

}
