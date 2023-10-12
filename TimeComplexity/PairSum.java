package TimeComplexity;

import java.util.Arrays;

public class PairSum {
public static int pairSum(int[]arr,int num) {
//	for(int i=0;i<l;i++) {
//		int temp=num-arr[i];
//		int st=0;
//		int end=l-1;
////		int mid=(st+end)/2;
//		while(st<end) {
//			int mid=(st+end)/2;
//			if(arr[mid]>temp) {
//				end=mid-1;
//			}else if(arr[mid]<temp) {
//				st=mid+1;
//			}else {
//				count++;
//				break;
//			}
//		}
//      
//		}
//	
//	Arrays.sort(arr);
//	for(int i=0,j=l-1;i<j;)
//	{
//		int sum=arr[i]+arr[j];
//		if(sum>num) {
//			j--;
//		}else if(sum<num) {
//			i++;
//		}else {
//			count++;i++;j--;
//		}
//	}
//	return count;
//	when all the elements equal
/*

this block will get executed


that is preventing overlapping condition 


your while loops

*/
	int count=0;
	int l=arr.length;
	Arrays.sort(arr);
	if(l==0){
		return 0;
	}
	Arrays.sort(arr);
	if (arr[0] == arr[l - 1]) {
		for (int i = 0; i < l; i++) {
			count += i;
		}
		return count;
	}
	
	for(int i=0,j=l-1;i<j;) {
		int sum=arr[i]+arr[j];
		if(sum>num) {
			j--;
			
		}else if(sum<num) {
			i++;
		}else {
			int m=arr[j];
			int n=arr[i];
			int jc=0;
			int ic=0;
			if(arr[i]==arr[j]) {
				int x=j-i;
				count+=(x*(x+1))/2;
				return count;
			}
			while(arr[i]==n) {
				ic++;
				i++;
			}
		
			while(arr[j]==m) {
				jc++;
				j--;
			}
			count=count+(ic*jc);
			
		}
	}
	return count;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[]arr= {2,8,10,5,-2,5,6,5};
	int num=8;
//	pairSum(arr, num);
	System.out.println(pairSum(arr, num));
	Arrays.sort(arr);
//	for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+" ");
//	}
	
		
	}

}
