package OOPs;

public class constructor {
private int a;
private int b;
final static int c=10;
public constructor() {
	this(10,20);
	System.out.println("constructor one"+ this.a+ " "+this.b);
}
constructor(int a ,int b){
	this.a=a;
	this.b=b;
	System.out.println("constructor two");
}
//public  void setC(int c) {
//	this.c=c;
//}
public void print() {
	System.out.println(a+" "+ b);
}
}
