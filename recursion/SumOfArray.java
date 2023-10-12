package recursion;

public class SumOfArray {
public static int sumeArray(int[]input) {
	if(input.length==1) {
		return input[input.length-1];
	}
	
	int[] smarr=new int[input.length-1];
	for(int i=1;i<input.length;i++) {
		smarr[i-1]=input[i];
		
	}
	
	int output=input[0]+sumeArray(smarr);
	return output;
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,4,5};
System.out.println(sumeArray(arr));

	}

}
