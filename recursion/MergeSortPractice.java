package recursion;

public class MergeSortPractice {
	public static void merge(int[] arr1,int arr2[],int[] arr3) {
		int i=0,j=0,k=0;
		for(;i<arr1.length&&j<arr2.length;k++) {
			if(arr1[i]>arr2[j]) {
				arr3[k]=arr2[j++];
				
			}else {
				arr3[k]=arr1[i++];
			}
		}
		while(i<arr1.length) {
			arr3[k++]=arr1[i++];
			
		}
		while(j<arr2.length) {
			arr3[k++]=arr2[j++];
		}
	}
	
	
public static  void mergeSort(int[] arr) {
//	base case
	if(arr.length<=1) {
		return;
	}
	int[] output1=new int[arr.length/2];
	int[] output2=new int[arr.length-output1.length];
	int i=0;
	for(;i<arr.length/2;i++) {
		output1[i]=arr[i];
	}
	for(;i<arr.length;i++) {
		output2[i-output1.length]=arr[i];
	}
//	int[]arr= {1,7,2,9,5,6};
	mergeSort(output1);
	mergeSort(output2);
	merge(output1, output2,arr);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,7,2,9,5,6};
		mergeSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
