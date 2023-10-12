package Array;

public class SumOnBoundariesAndDiagonals {
	public static void sumofAll(int[][]arr) {
		int rows=arr.length;
		int cols=arr[0].length;
		int sum = 0;
//		sum of 1 row
		for(int i=0;i<cols;i++) {
			sum+=arr[0][i];
		}
//		sum of last row
		for(int i=0;i<cols;i++) {
			sum+=arr[rows-1][i];
		}
//		sum of all ii elements except for 00&nn
		for(int i=1;i<cols-1;i++) {
			sum+=arr[i][i];
		}
//		sum of all reducing j of other diagonal
		for(int i=1,j=cols-2;j>0;j--,i++) {
			if(i==j) {
				continue;
			}else {
				sum+=arr[i][j];
			}
			
		}
//			sum of 1 st column 
		for(int i=1;i<rows-1;i++) {
			sum+=arr[i][0];
			sum+=arr[i][cols-1];
		}
//		sum of last col
//		for(int i=1;i<rows-1;i++) {
//		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
sumofAll(arr);
	}

}
