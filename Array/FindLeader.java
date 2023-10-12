package Array;

public class FindLeader {
public static void findLeader(int[]arr) {
	int l=arr.length;
	int li=l-1;
	System.out.print(arr[li]+" ");
	for(int i=li-1;i>=0;i--) {
		int j=i+1;
		for(;j<l;j++) {
			if(arr[i]<arr[j]) {
				break;
			}
		}
		if(j==l) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {13,17,5,4,6};
findLeader(arr);
	}

}
