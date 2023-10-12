package Array;

public class Maxsubarray {
public static int max_sum(int[] arr, int n, int k) {
	int cur_sum =0;
	for(int i=0;i<k;i++) {
		cur_sum+=arr[i];
		
	}
	int max_sum=cur_sum;
	for(int i=k;i<n;i++) {
		cur_sum-=arr[i-k];
		cur_sum+=arr[i];
		max_sum=Math.max(max_sum, cur_sum);
	}
	return max_sum;
}
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6};
	System.out.println(max_sum(arr, 6, 2));
}
}
