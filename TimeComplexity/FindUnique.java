package TimeComplexity;
//this problem is solved using  for which it will have time complexity of O(n+nlogn);
//this problem is solved using  frequency array concept forr which its time complexity will be k1n+k2n=>O(n);
//above approach will fail in case of arr[i]>9
//sorting will give s logs
public class FindUnique {
public static int findUnique(int[]arr) {
//	int l =arr.length;
////	int[]fre =new int[256];
////	we will sort it using selection sort
//	for(int i=1;i<l;i++) {
//		int temp=arr[i];
//		for(int j=i-1;j>=0;j--) {
//			if(arr[j]>temp) {
//				int temp2=arr[j];
//				arr[j+1]=temp2;
//				arr[j]=temp;
//			}
//		}
//	}
//	
//	for(int i=1;i+1<l;i++) {
//		int temp=arr[i];
//		if(arr[i-1]==temp) {
//			continue;
//		}
//		
//if(temp==arr[i+1]) {
//	return arr[i-1];
//}
//	}
//	if(arr[l-1]!=arr[l-2]) {
//		return arr[l];
//	}
//	
//	
//	
//	
//	return -1;
	int l =arr.length;
	if(l==1) {
		return arr[0];
	}
	int xor=0;
	for(int i=0;i<l;i++) {
		xor^=arr[i];
	}
	if(xor==0) {
		return -1;
	}
	return xor;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,1,6,3,6,2};
		System.out.println(findUnique(arr));

	}

}
