package recursion;

public class GeometricSumofHalf {
	public static double findGeometricSum(int k){
		// Write your code here
	if(k<=0){
		return 1;
	}
	// double output=(double)(1+1/2*findGeometricSum(k-1));
	double output=1+0.5*findGeometricSum(k-1);
	return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findGeometricSum(5));
	}

}
