package OOPs;

public class fraction {
private int numerator;
private int denominator;

public fraction(int a,int b) {
	this.numerator=a;
	this.denominator=b;
	simplify();
}
public int getNumerator() {
	return numerator;
}
public int getDenominator() {
	return denominator;
}
public void simplify() {
	int gcd=1;
	int i=(numerator<denominator)?numerator:denominator;
	for(;i>1;i--) {
		
		if(numerator%i==0 && denominator%i==0) {
			gcd=i;
			break;
		}
	}
	numerator=numerator/i;
	denominator=denominator/i;
}
void print() {
	 System.out.println(numerator+"/"+denominator);
}
public void increment() {
	numerator=numerator+denominator;
	simplify();
}
//public void addFraction(int a, int b) {
//	numerator =b*numerator+numerator*a;
//	denominator=b*numerator;
//	simplify();
//	print();
//}
public void addFractions(fraction f1) {
	this.numerator=f1.numerator*this.denominator + f1.denominator*this.numerator;
	this.denominator=f1.denominator*this.denominator;
}
public static fraction addFraction(fraction f1,fraction f2) {
	int newDemo=f1.denominator*f2.denominator;
	int newNumer=f1.numerator*f2.denominator + f1.denominator*f2.numerator;
	fraction f3 = new fraction(newNumer,newDemo);
	return f3;
}

}
