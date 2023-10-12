package Array;

public class RowWiseSum {
	public static void rowWiseSum(int[][]mat) {
		int row = mat.length;
		int col=mat[0].length;
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum+=mat[i][j];
			}
			System.out.print(sum+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] mat = {{1,2,3,4},{4,3,2,1}};
rowWiseSum(mat);

	}

}
