package recursion;

public class QuickSortPractise {
	public static int partition(int[]arr,int si,int ei) {
		int pivotelemen=arr[si];
//		int smalNumCount=0;
//		for(int i=si+1;i<=ei;i++) {
//			if(arr[i]<pivotelemen) {
//				smalNumCount++;
//			}
//		}
//		int temp=arr[si+smalNumCount];
//		arr[si+smalNumCount]=arr[si];
//		arr[si]=temp;
		int pivotEle=arr[si];
		int smallnuCount=0;
		for(int i=si+1;i<=ei;i++) {
			if(arr[i]<pivotEle) {
				smallnuCount++;
			}
		}
//		arr[si]=arr[smallnuCount-1];
//		arr[smallnuCount-1]=pivotEle;
		int temp=arr[si+smallnuCount];
		arr[si+smallnuCount]=arr[si];
		arr[si]=temp;
		for(int i=si,j=ei;i<j;) {
			if(arr[i]<pivotEle) {
				i++;
			}else if(arr[j]>pivotEle) {
				j--;
			}else {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		return si+smallnuCount;
		
		
	}
	
	public static void quickSort(int[] arr, int si, int ei) {
		if(si>=ei) {
			return;
		}
		int pivotIndex=partition(arr, si, ei);
		quickSort(arr, si, pivotIndex-1);
		quickSort(arr, pivotIndex+1, ei);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,5,9,0,4,3};
quickSort(arr, 0, arr.length-1);
for (int i : arr) {
	System.out.print(i+" ");
}
	
}

}
