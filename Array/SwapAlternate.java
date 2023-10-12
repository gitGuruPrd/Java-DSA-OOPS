package Array;

public class SwapAlternate {
	public static void swapAlternate(int[]arr) {
		int i=0;
		int n=arr.length;
		int j=1;
		
		while(j<n) {
			int k =arr[i];
			arr[i]=arr[j];
			arr[j]=k;
			j+=2;
			i+=2;
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,2,3,4,5,6};
swapAlternate(arr);
int i=0;
while( i<arr.length) {
	System.out.println(arr[i]);
	i++;
}
	}

}
