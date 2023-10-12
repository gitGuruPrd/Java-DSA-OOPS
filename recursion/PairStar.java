package recursion;

public class PairStar {
public static String  pairStair(String input){
	if(input.length()==1) {
		return input;
	}
	String smString = input.substring(1,input.length());
	if(input.charAt(0)==smString.charAt(0)) {
		return input.charAt(0)+"*"+pairStair(smString);
	}else {
		return input.charAt(0)+pairStair(smString);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(pairStair("aaaa"));
	}

}
