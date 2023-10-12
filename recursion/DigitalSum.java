package recursion;

public class DigitalSum {
	public static int sumOfDigits(int input) {
		if(input/10==0) {
			return input%10;
		}
		int digit=input%10;
		int output=digit+sumOfDigits(input/10);
		return output;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=123456789;
System.out.println(sumOfDigits(x));
	}

}
