package TimeComplexity;

public class IntersectionOfTwoArrays {
//in this aapproach we will do selection sort
	public static void insertionSort(int[]arr) {
		int l=arr.length;
		for(int i=1;i<l;i++) {
			int temp=arr[i];
			for(int j=i;j>=0;j--) {
				if(arr[j]>temp) {
					int temp2=arr[j];
					arr[j+1]=temp2;
					arr[j]=temp;
				}
			}
			
			
		}
		
	}
	public static void intersectionArrays(int[] arr1,int[]arr2) {
	int m=arr2.length;
	int n=arr1.length;
	insertionSort(arr2);
	insertionSort(arr1);
	for(int i=0,j=0;i<n&&j<m;) {
		if(arr1[i]>arr2[j]) {
			j++;
		}else if(arr1[i]<arr2[j]) {
			i++;
		}else {
			System.out.print(arr1[i]+" ");
			i++;j++;
		}
	}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {2,3,1,6,3,6,2};
int[]arr1= {1,3,4,5,7};
insertionSort(arr);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
//intersectionArrays(arr, arr1);
	}

}
