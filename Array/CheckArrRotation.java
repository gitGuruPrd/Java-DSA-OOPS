package Array;

public class CheckArrRotation {
	public static int checkArrayRotation(int[]arr) {
		int i = 0,count=1;
		while(i+1<arr.length) {
			if(arr[i+1]>arr[i]) {
				count++;
			}else {
				return
						count;
			}
			i++;
		}
		
		
		

return 0;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {5,6,7,8,9,10};
		System.out.println(checkArrayRotation(arr));
		
		

	}

}
