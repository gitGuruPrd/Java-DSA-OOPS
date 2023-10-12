package Strings;

public class RemoveCharacter {
public static String removeChar(String str,char ch) {
	String ans="";
	int n=str.length();
	for(int i=0;i<n;i++) {
		if(str.charAt(i)!=ch) {
			ans+=str.charAt(i);
		}
	}
	return ans;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Betty bought a bit of butter ";
char ch='a';
System.out.println(removeChar(str, ch));
	}

}
