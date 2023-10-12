package Array;

public class ArrangeNumbersInArray {
	public static void arrange(int[] arr, int n) {

	
		
		
//		int i=0;
//		int j=n-1;
//		int odd=1;
//		int eve=2;
//
//		while(arr[i]==0) {
//			
//			if(arr[i]==0) {
//				arr[i]=odd;
//			}
//			if(arr[j]==0) {
//				arr[j]=eve;
//			}
//
//			odd+=2;
//			eve+=2;
//			i++;
//			j--;
//		}
		int i=0;
		int j=n-1;
		int count=1;
		while(i<j){
		if(count%2!=0){
			arr[i]=count;
		}
		else if(count%2==0){
			arr[j]=count;
			System.out.println("im here");
		}
		count++;
		i++;
		j--;

		}
		int index=0;
		while(index<n) {
			System.out.print(arr[index]+" ");
			index++;
		}

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int []arr =new int[n];
//		System.out.println(); 
		arrange(arr, n);
		
	}

}
