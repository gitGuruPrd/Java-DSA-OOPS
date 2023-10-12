package recursion;

public class RemoveDuplicatesRecursively {
	public static String removeDuplicates(String s){
	if(s.length()<=1) {
		return s;
		
	}
		String snxt=removeDuplicates(s.substring(1, s.length()));
		if(s.charAt(0)==snxt.charAt(0)) {
			return snxt;
		}else {
			return s.charAt(0)+snxt;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="xxxyyyzzz";
		System.out.println(removeDuplicates(str));
	}

}
