package Array;

public class PrintLikeAwave {
public static void printLikeAwave(int[][]mat) {
	int rows =mat.length;
	int cols=mat[0].length;
	int j=0;
int i=0;
	while(j<cols) {
	
	if(i==rows) {
		for(i=rows-1;i>=0;i--) {
			System.out.print(mat[i][j]+" ");
		}
	}else {
		for(i=0;i<rows;i++) {
			System.out.print(mat[i][j]+" ");
		}
	}
	j++;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		printLikeAwave(arr);
	}

}
