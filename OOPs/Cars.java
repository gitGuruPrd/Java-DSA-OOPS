package OOPs;

//import java.awt.Frame;
// to remove the error we can mark this class abstract or we can implement the abstract method f vehicle here
// and if we mark car class abstract the we cant create object of car class
public class  Cars extends Vehicle {
// static variable belongs to a class not an object
	@Override
	public  boolean isMotorised() {
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor cs = new constructor();
//		System.out.println(constructor.c);
		fraction fr = new fraction(9, 7);
		
		fraction fr2 =  new fraction(4, 8);
		fraction fr3=fraction.addFraction(fr, fr2);
		fr3.print();
//		Vehicle v = new Vehicle(); because vehicle class is abstract ie incomplete
//		v.color="vibgyor";
//		v.wheels=4;
		
	}

}
