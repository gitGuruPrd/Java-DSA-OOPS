package Strings;

public class ReverseString {
public static String reverseString(String str) {
	int n =str.length()-1;
	String reverseString="";
	for(int i=n;i>=0;i--) {
reverseString+=str.charAt(i);

		
	}
	return reverseString;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hi! How u doin";
System.out.println(reverseString(str));
	}

}
