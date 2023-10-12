package Strings;

public class AllSubstrings {
public static void allSubstrins(String str) {
//	int n =str.length();
//	int j=0,i=0;
//
//while(j<n) {
//	for(i=j+1;i<=n;i++) {
//		System.out.println(str.substring(j,i));
//	}
//	j++;
//}
//System.out.println(str.charAt(n-1));
	 for(int len=1;len<=str.length();len++){
         //We have to print all strings wih length as "len"
         for(int start=0;start<=str.length()-len;start++){
             int end=start+len-1;
             System.out.println(str.substring(start,end+1));
         }
     }
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Howdi");
		allSubstrins(str);
//		System.out.println(str.substring(3,4));
		
	}

}
