package Strings;

public class StringPallindrome {
public static boolean stringPallindrome(String str) {
	boolean isStringPallindrome =true;
	String chexkString =str;
	int n =str.length();
	for(int i=0;i<n/2;i++) {
		if(str.charAt(i)!=chexkString.charAt(n-i-1)) {
			isStringPallindrome=false;
		}
	}
	
	return isStringPallindrome;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="coding";
System.out.println(stringPallindrome(str));
	}

}
