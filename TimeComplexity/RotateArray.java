package TimeComplexity;

public class RotateArray {
public static void rotateArray(int[]arr,int d) {
	
	int l=arr.length;
//	int[] arr2=new int[l-d];
	int[] arr1=new int[d];
	for(int i=0;i<d;i++) {
		arr1[i]=arr[i];
	}
	for(int i=d-1,j=0;i<l;i++,j++) {
//		int temp=arr[i];
		arr[j]=arr[i];
		
		
	}
	for(int i=l-d-1,j=0;i<l;i++) {
		arr[i]=arr[j];
	}
	
	
	
	
	


}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {1,2,3,4,5,6};
int d=2;
//for(int i=0;i<arr.length/2;i++) {
//	int temp=arr[i];
//	arr[i]=arr[arr.length-1-i];
//	arr[arr.length-1-i]=temp;
//}
//rotateArray(arr, 2);
int l=arr.length;
//int[] arr2=new int[l-d];
int[] arr1=new int[d];
for(int i=0;i<d;i++) {
	arr1[i]=arr[i];
}
for(int i=d,j=0;i<l;i++,j++) {
//	int temp=arr[i];
	arr[j]=arr[i];
	
	
}
for(int i=l-d,j=0;i<l;i++,j++) {
	arr[i]=arr1[j];
}
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
