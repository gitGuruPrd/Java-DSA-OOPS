package Array;

public class PushZeroToEnd {
public static void pushZeroToEnd(int[]arr) {
	int i=0;
	int count=0;
	while(i<arr.length) {
		if(arr[i]!=0) {
		int swap = arr[i];
		arr[i]=arr[count];
		arr[count]=swap;
		++count;
			

		}
		
		i++;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {2,0,0,1,3,0,0};
		pushZeroToEnd(arr);
		int i =0;
		while(i<arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}
		
	}

}
