package Array;

public class FindUnique {
	public static int findUnique(int[] arr) {
		int n= arr.length;
		int i=0;
		
		int unique =0;
		while(i<n) {
			
			for(int j=0;j<n;j++) {
				if(i==j) {
					continue;
				}else if(arr[i]==arr[j]){
					break;
				}else if(j==(n-1)) {
					unique=arr[i];
				}
				
			}
		i++;
		}
		return unique;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[]arr= {1,2,2,2,1,3,4};
	System.out.println(findUnique(arr));
	int i=Integer.MAX_VALUE;
	System.out.println(i);
	
	}

}
