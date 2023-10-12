package Strings;

public class CompressTheString {
public static String compressTheString(String str) {
	String ans="";
	int n=str.length();
	int count=49;
	int i=1;
	for(;i<n;i++) {
		String temp="";
		if(str.charAt(i-1)==str.charAt(i)) {
			count++;
		}else if(count>49) {
			ans+=str.charAt(i-1);
			ans+=(char)(count);
			count=49;
		}else {
			ans+=str.charAt(i-1);
		}
	}
	i--;
	ans+=str.charAt(i);
	if(count>49) {
		ans+=(char)(count);
	}
	
	return ans;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="aaabbcdd";
System.out.println(compressTheString(str));
	}

}
