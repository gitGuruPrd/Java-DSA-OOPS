package Array;

public class PrintSpiral {
public static void printSpiral(int matrix[][]) {
//	int rows=matrix.length;
//	int cols=matrix[0].length;
//	int cs=0,ce=cols-1;
//	int rs=0,re=rows-1;
//	
//int count=1;
//while(count<=(rows*cols)) {
//	for(int i=cs;i<=ce;i++) {
//		System.out.print(matrix[rs][i]);
//		count++;
//	}rs++;
//	for(int i=rs;i<=re;i++) {
//		System.out.print(matrix[i][ce]);
//		count++;
//	}ce--;
//	for(int i=ce;i>=cs;i--) {
//		System.out.print(matrix[re][i]);
//		count++;
//	}re--;
//	for(int i=re;i>=rs;i--) {
//		System.out.print(matrix[i][cs]);
//		count++;
//	}cs++;
//	
//}
	   int row=matrix.length;
   int col=matrix[0].length;
     int count=row*col;
    int x=1;
     int rs=0;
    int cs=0;
     int re=row-1;
   int ce=col-1;
     while(x<=count){
      for(int i=rs;i<re;i++){
          for(int j=cs;j<ce;j++){
                System.out.print(matrix[i][j]+" ");
                x++;
            }
            
            
         }
   }
	
/*
while(count<rows) {
//	first j increment
	
	for(;j<cols;j++) {
		System.out.print(matrix[i][j]+" ");
		
	}
//	2 i incremet
	for(;i<rows;i++) {
		System.out.print(matrix[i][j]+" ");	
	}
	
//	3 j decrement
	for(;j>0;j--) {
		System.out.print(matrix[i][j]+" ");	
	}
//	4 i decrement
	for(;i>count;i--) {
		System.out.print(matrix[i][j]+" ");	
	}
	
	
	
	
	
	count++;
}
*/
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,2,3,10},{4,5,6,20},{7,8,9,30},{11,12,13,40}};
		printSpiral(arr);
	}

}
