package Array;

public class LinearSearch {

	public static int linearSearch(int[]arr,int x) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				index=i;
				return index;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,9,10,7,6};
//		arr[]=;
		
		int x=7;
		System.out.println(linearSearch(arr, x));;

	}

}
