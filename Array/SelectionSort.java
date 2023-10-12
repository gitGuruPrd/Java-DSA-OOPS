package Array;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int swap=arr[i];
					arr[i]=arr[j];
					arr[j]=swap;
				}
				
			}
			
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,5,2,4,8};
		selectionSort(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
