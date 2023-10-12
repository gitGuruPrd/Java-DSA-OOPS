package TimeComplexity;

public class ArrayEquillibriumIndex {
public static int equilibriumIndex(int[] arr) {
	int l=arr.length;
	int sumR=0;
	int sumL=0;
	for(int i=1;i<l;i++) {
		sumR+=arr[i];
	}
	for(int i=1;i<l-1;i++) {
		sumL+=arr[i-1];
		sumR-=arr[i];
		if(sumL==sumR) {
			return i;
		}
		
	}
	
	
	
	return -1;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {6,1,6,5,3,2,5,0,5,6,0};
		System.out.println(equilibriumIndex(arr));

	}

}
