package TimeComplexity;

import java.util.Arrays;

public class TripletSum {
	public static int  tripletSum(int[]arr,int num) {
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
		for(int k=0;k<l;k++) {
			
			int dnum=num-arr[k];
		for(int i=0,j=l-1;i<j;) {
			int sum=arr[i]+arr[j];
			if(sum>dnum) {
				j--;
				
			}else if(sum<dnum) {
				i++;
			}else {
				int m=arr[j];
				int n=arr[i];
				int jc=0;
				int ic=0;
				if(arr[i]==arr[j]){
					int x=j-i;
					count+=(x*(x+1))/2;
//					return count;
				    break;
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
		}
		return count;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
