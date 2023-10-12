package Array;

public class SumOfTwoArrays {
public static void sumOfTwoArrays(int[]arr1,int[]arr2,int[]outPut) {
	int i=arr1.length-1;
	int j=arr2.length-1;
	int k=outPut.length-1;
	int carry =0;
	int min=(i>j)?i:j;
	while(k>=0) {
		int num=0;
//		if(j<=0&&i>=0) {
//			num=arr1[i]+carry;
//			outPut[k]=num%10;
//			carry=num/10;
//		}else if (i<=0) {
//			
//		}else {
//			num=arr1[i]+arr2[j]+carry;
//			outPut[k]=num%10;
//			carry=num/10;
//		}
		if(i>=0&&j>=0) {
			num=arr1[i]+arr2[j]+carry;
			outPut[k]=num%10;
			carry=num/10;
			
		}else if (i>=0) {
			num=arr1[i]+carry;
			outPut[k]=num%10;
			carry=num/10;
		}else if (j>=0) {
			num=arr2[j]+carry;
			outPut[k]=num%10;
			carry=num/10;
		}else {
			num=carry;
			outPut[k]=num%10;
			carry=num/10;
		}
		k--;
		j--;
		i--;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1 = {1,2,3,4,10};
		int[]arr2= {1,2,3,4,10};
		int[]op=new int[4];
		
//		sumOfTwoArrays(arr1, arr2, op);
//		int i =0;
//		while(i<op.length) {
//			System.out.print(op[i]+" ");
//			i++;
//		}
		int i =3,j=3;
		int min=(i>j)?i:j;
		System.out.println();
		

	}

}
