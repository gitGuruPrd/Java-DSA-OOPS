package Array;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
for(int i=arr.length;i>0;i--) {
	for(int j=0;j<i-1;j++) {
		if(arr[j+1]<arr[j]) {
			int swap=arr[j+1];
			arr[j+1]=arr[j];
			arr[j]=swap;
		}
	}
}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {7,2,5,1};
		bubbleSort(arr);
		int i=0;
		while(i<arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}

	}

}
