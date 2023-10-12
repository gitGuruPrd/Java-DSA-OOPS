package TimeComplexity;
//using merge sort find intersection of two arrays
public class IntersectionOfTimeComplexity {
public static int[] mergeSort(int[] arr1,int[]arr2) {
	int n=arr1.length;
	int m=arr2.length;
	int sarr[]= new int[m+n];
	int j=0,i=0,k=0;
	while(i<n&&j<m) {
//		int min=Integer.MAX_VALUE;
		if(arr1[i]<=arr2[j]) {
			sarr[k]=arr1[i];
			i++;
		}else {
			sarr[k]=arr2[j];
			j++;
		}
		k++;
	}
	while(i<n) {
		sarr[k]=arr1[i];
		k++;i++;
		
	}
	while(j<m) {
		sarr[k]=arr2[j];
		k++;
		j++;
				
	}
	return sarr;
	
}
public static void arrayIntersection(int[]arr1,int[]arr2) {
	int[] rarr=mergeSort(arr1, arr2);
	for(int i=1;i<rarr.length;i++) {
		if(rarr[i-1]==rarr[i]) {
			System.out.print(rarr[i]+" ");
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1= {6,9,8,5};
int[] arr2= {9,2,4,1,8};
int sarr[]=mergeSort(arr1, arr2);
for(int i=0;i<sarr.length;i++) {
	System.out.print(sarr[i]+" ");
}
//arrayIntersection(arr1, arr2);
}

}
