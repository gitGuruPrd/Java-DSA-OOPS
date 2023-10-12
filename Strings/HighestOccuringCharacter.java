package Strings;

public class HighestOccuringCharacter {
public static char highestOccurence(String str) {
	int[] frequency=new int[256];
	int n= str.length();
	char ch=str.charAt(0);
	int max=1;
	int i=1;
	while(i<n) {
		
		char cai=str.charAt(i);
		char catmi=str.charAt(i-1);
		++frequency[cai];
		if(frequency[cai]>max) {
			max=frequency[cai];
			ch=cai;
		}
		
		i++;
		}
	
	
	
	
	
	return ch;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="asdfkjhgfvfterf";
System.out.println(highestOccurence(str));



	}

}
