package Array;

public class InterSectionOfTwoArrays {
	public static int findUnique(int[] arr) {
		int n= arr.length;
		int i=0;
		
		int duplicate =-1;
		
		while(i<n) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					continue;
				}else if(arr[i]==arr[j]) {
					duplicate=arr[i];
					return duplicate;
					
				} 
					
			}
			i++;
		}
		return duplicate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[]arr= {1,2,2,2,1,3,4};
	System.out.println(findUnique(arr));
	int i=Integer.MAX_VALUE;
	System.out.println(i);
	
	}

}
