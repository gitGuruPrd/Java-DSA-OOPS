package recursion;



public class QuickSort {
	
	public static int partition(int[]arr,int si,int ei) {
		int pivotelemen=arr[si];
		int smalNumCount=0;
		for(int i=si+1;i<=ei;i++) {
			if(arr[i]<pivotelemen) {
				smalNumCount++;
			}
		}
		int temp=arr[si+smalNumCount];
		arr[si+smalNumCount]=arr[si];
		arr[si]=temp;
		int i=si;
		int j=ei;
		while(i<j) {
			if(arr[i]<pivotelemen) {
				i++;
				
			}else if(arr[j]>=pivotelemen) {
				j--;
				
			}else {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
				
			}
		}
		return si+smalNumCount;
		
		
	}
	public static void quickSort(int[] input, int startIndex, int endInedx) {
	
		if(startIndex>=endInedx) {
			return;
		}
		int pivotIndex=partition(input, startIndex,endInedx);
		quickSort(input, startIndex,pivotIndex-1);
		quickSort(input, pivotIndex+1, endInedx);
		
		
	}
	public static void quickSort(int[]input) {
		
		quickSort(input, 0, input.length-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
