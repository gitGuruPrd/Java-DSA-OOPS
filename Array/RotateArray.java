package Array;

public class RotateArray {
	public static void rotateArray(int[]arr,int d) {
		int i=0;
		int[]temp=new int[d];
		while(i<d) {
			temp[i]=arr[i];
			i++;
		}
		i=0;
		while(d<arr.length) {
			arr[i]=arr[d];
			i++;
			d++;
		}
		int j=0;
		while(i<arr.length) {
		arr[i]=temp[j];
		i++;
		j++;
		}


		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {1,2,3,4,5,6};
int d=2;
rotateArray(arr, 2);
int i=0;
while(i<arr.length) {
	System.out.print(arr[i]+" ");
	i++;
}
	}

}
