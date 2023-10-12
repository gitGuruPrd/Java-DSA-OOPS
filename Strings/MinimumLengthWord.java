package Strings;

public class MinimumLengthWord {
public static String minWordLength(String input) {
	int min=Integer.MAX_VALUE;
	int l=input.length();
	int cws=0;
	int cwe=0;
	String ans="";
	
	for(int i=0;i<l;i++) {
		char ch=input.charAt(i);
		if(ch==' ') {
			cwe=i-1;
			int cwl=cwe-cws+1;
			if(cwl<min) {
				min=cwl;
				String cw="";
				for(int j =cws;j<=cwe;j++) {
					cw+=input.charAt(j);
				}
				ans=cw;
			}
			cws=i+1;
			
		}else if(i==l-1) {
			cwe=i;
			int cwl=cwe-cws+1;
			if(cwl<min) {
				min=cwl;
				String cw="";
				for(int j =cws;j<=cwe;j++) {
					cw+=input.charAt(j);
				}
				ans=cw;
			}
		}
		
		
	}
//	for(int i=l-1;i)
	return ans;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
