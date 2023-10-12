package OOPS2;

import Exception.DivideByZeroException;

public class ExceptionHandling {
public static int divide(int a, int b)throws DivideByZeroException {
	if(b==0) {
		throw new DivideByZeroException();
	}
	return a/b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divide(10,0);
			System.out.println("This statement wont get executed ");
			
			
		} catch (DivideByZeroException e) {
			System.out.println("Divisor cant be zero");
			// TODO: handle exception
		}
	}

}
