package Array;

public class MaximTheSum {
public static long macSumPath(int[]input1,int[]input2) {
	int n=input1.length;
	int m=input2.length;
	int i=0,j=0;
	boolean intersection=false;
	long sum=0,sum1=0,sum2=0;
	byte count=0;
	for(;i<m&&j<n;) {
//		sum+=input2[i];
		if(count==0) {
			sum2+=input2[i];
			System.out.println("sum2 j"+" "+sum2+" "+i);
			if(input1[j]<input2[i]) {
				j++;
				i++;
			}else if(input1[j]>input2[i]) {
				i++;
			}else {
				count =1;
				j++;
			}
			
		}else {
			intersection=true;
			sum1+=input1[j];
			System.out.println("sum1 i"+" "+sum1+" "+j);
			if(input1[j]>input2[i]) {
				i++;
				j++;
			}else if(input1[j]<input1[i]) {
				j++;
			}else {
				count=0;
				i++;
			}
		}
		
		
	}
	sum=sum2+sum1;
	while(i<m) {
		sum+=input2[i];
		i++;
	}
	while(j<n){
		sum+=input1[j];
		j++;
	}
	
//	for(int j=0;j<m;j++) {
//		sum2+=input2[j];
//		
//	}
//	for(int j=0;j<n;j++) {
//		sum1+=input1[j];
//		
//	}
//	while(i<m)
	if(!intersection) {
		sum1=0;
		sum2=0;
		i=0;j=0;
		while(i<m) {
			sum1+=input1[i];
			i++;
		}
		while(j<n) {
			sum2+=input2[j];
			j++;
		}
		System.out.println(sum1+" "+sum2);
		return (sum1>sum2)?sum1:sum2;
	}
//	System.out.println(i+"i"+" "+j+"j");
	return sum;
//	int[]narr=new int[m+n];
////	int i=0;
//	for(int j=0;j<m;j++,i++) {
//		narr[i]=input2[j];
//	}
//	for(int j=0;j<n;j++) {
//		narr[]
//	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1= {2,2,2,2,5};
int[] arr2= {2,2,2,2,5};
System.out.println(macSumPath(arr1, arr2));

	}

}
