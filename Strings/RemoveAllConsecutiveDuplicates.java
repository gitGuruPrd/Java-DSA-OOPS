package Strings;
/*
 * Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 */
public class RemoveAllConsecutiveDuplicates {
	public static String removeConsecutive(String str) {
		int n= str.length();
		String ans="";
		for(int i=0;i<n;i++) {
			ans+=str.charAt(i);
			char ch=str.charAt(i);
			while(i+1<n) {
				if(ch!=str.charAt(i+1)) {
					break;
				}
				i++;
			}
					
			}
		
		return ans;
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="abbscb";
System.out.println(removeConsecutive(str));
	}

}
