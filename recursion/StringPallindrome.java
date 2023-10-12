package recursion;
//check for return statements
public class StringPallindrome {
	public static boolean isStringPallind(String input,int si,int ei) {

		if(si>=ei) {
			return true;
		}
		boolean otpt=isStringPallind(input, si+1, ei-1);
		if(input.charAt(si)!=input.charAt(ei)) {
			return false;
		}else {
			return otpt;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="andana";
System.out.println(isStringPallind(str, 0, str.length()-1));
	}

}
