package Strings;

public class CheckPermutation {
public static boolean isPermutation(String str1,String str2) {
	if(str1.length()!=str2.length()) {
		return false;
	}
	boolean isperm =true;
 StringBuffer sf=new StringBuffer(str2);
 for(int i=0;i<str1.length();i++) {
	 int j = 0;
	for (; j < sf.length(); j++) {
		if(str1.charAt(i)==sf.charAt(j)) {
//			sf.deleteCharAt(j);
			sf.setCharAt(j, '@');
			break;
		}
		
	}
	if (j==sf.length()) {
		return false;
		
	}
	
	
 }
	return isperm;
//	for(int i=0;i<str1.length();i++) {
//		int j = 0;
//		for (; j < str2.length(); j++) {
//			if(str1.charAt(i)==str2.charAt(j)) {
////			str2.charAt(j)=(char)(str2.charAt(j)+26);
////				str2=str2-str2.charAt(j);
//				String temp="";
//				for(int k=0;k<str2.length();k++) {
//					if(str2.charAt(j)!=str2.charAt(k)) {
//					temp+=str2.charAt(k);}else {
//						temp+=(char)(str2.charAt(j)+
//					}
//					
//				}
//				str2=temp;
//				break;
//				
//			}
//		}
//		if(str2.length()==0) {
//			return true;
//		}
//		
//	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="listen",str2="silent";
System.out.println(isPermutation(str1, str2));
//StringBuffer sf= new StringBuffer(str1);
//if(str2.charAt(0)==sf.charAt(0)) {
//	sf.deleteCharAt(0);
//}
//str1+=(char)(str1.charAt(0)+1);
//System.out.println(str1);
	
	
	}

}
