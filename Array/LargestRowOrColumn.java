package Array;

public class LargestRowOrColumn {
	public static void findLargest(int[][] mat) {
		int rows=mat.length;
		int col=mat[0].length;
		int rindex=0;
		int cindex=0;
		int rowSum=Integer.MIN_VALUE;
		int colSum=Integer.MIN_VALUE;
		for(int i=0;i<rows;i++) {
			int sum =0;
			
			for(int j=0;j<col;j++) {
				sum+=mat[i][j];
			}
			if(sum>rowSum) {
				rindex=i;
				rowSum=sum;
			}
			
		}
		for(int i=0;i<col;i++) {
			int sum =0;
			for(int j=0;j<rows;j++) {
				sum+=mat[j][i];
			}
			if(sum>colSum) {
				rindex=i;
				colSum=sum;
			}
		}
//		System.out.println(((rowSum>colSum)?rowSum:colSum)+" "+((rowSum>colSum)?rindex:cindex));
		System.out.println(((rowSum>colSum)?"row":"column"));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,4},{4,-1,2,6}};
		findLargest(arr);
//		System.out.println(arr.length);

	}

}
