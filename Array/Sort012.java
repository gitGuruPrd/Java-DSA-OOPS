package Array;

public class Sort012 {
	public static void sort012(int[]arr) {
		int zeroes=0,ones=0,twos=0;
		int i=0;
		while(i<arr.length) {
			if(arr[i]==0) {
				zeroes++;
			}else if (arr[i]==1) {
				ones++;
				
			}else {
				twos++;
			}
			i++;
		}
		int j=0;
	for(;j<zeroes;j++) {
		arr[j]=0;
	}
		for (;ones>0; j++,ones--) {
			
			arr[j]=1;
		}
		for(;twos>0;twos--,j++) {
			arr[j]=2;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {0,1,2,0,2,1};
		sort012(arr);
		int i =0;
		while(i<arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}
	}

}
