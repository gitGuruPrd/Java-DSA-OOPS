package recursion;

public class ConvertStringToIntegers {
public static int stringToInteger(String input) {
//	'1'=49 ascii value
	if(input.length()==0){
		return 0;
	}
	int digit=input.charAt(input.length()-1)-48;
	int out =stringToInteger(input.substring(0, input.length()-1));
	return out*10+digit;

	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(stringToInteger("1234567"));
	}

}
