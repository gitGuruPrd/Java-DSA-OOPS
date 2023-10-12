package Strings;

public class CountWords {
public static int countWords(String str) {
	int count=1;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "This a sample string";
System.out.println(countWords(str));
	}

}
