package Array;

public class ReverseEachWord {
 public static String reverseEachWord(String str) {
	 String ans="";
	 int n= str.length();
	 int ws=0;
	 int we=0;
	 for(int i=0;i<n;i++) {
		 if(str.charAt(i)==' ') {
			 we=i-1;
			 while(we>=ws) {
				 ans+=str.charAt(we);
				 we--;
			 }
			 ans+=' ';
			 ws=i+1;
		 }
//		 else if(i==n-1) {
//			 we=n-1;
//			 while(we>=ws) {
//				 ans+=str.charAt(we);
//				 we--;
//			 }
//			 return ans;
		 
		 
	 
	 
	 }
	 we=n-1;
	 while(we>=ws) {
		 ans+=str.charAt(we);
		 we--;
	 }
	 return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str= "hello";
String rev="";
//int ws =0;
//int we =str.length()-1;
//while(we>=ws) {
//	rev+=str.charAt(we);
//	we--;
//}
//System.out.println(rev);
String check="Hello, how are you";
System.out.println(reverseEachWord(check));
	}

}
