package Strings;

public class ReverseStringWordWise {
	public static String reverseWordWise(String input) {
		// Write your code here
//		
		String ans="";
		int l=input.length();
		int i=l-1;
		int ws=0,we=i;
		for(;i>=0;i--) {
			if(input.charAt(i)==' ') {
				ws=i+1;
				while(ws<=we) {
					ans+=input.charAt(ws);
					ws++;
				}
				ans+=' ';
				we=i-1;
			}
		}
		i++;
		ws=i;
		while(i<l) {
			if(input.charAt(i)==' ') {
				we=i-1;
				while(ws<=we) {
					ans+=input.charAt(ws);
					ws++;
				}
				break;
			}
			i++;
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi How you doin";

		System.out.println(reverseWordWise(str));
		
		
	}

}
