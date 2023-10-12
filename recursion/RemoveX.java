package recursion;

//import javax.print.DocFlavor.INPUT_STREAM;

public class RemoveX {
public static String removeX(String str) {
	
	if(str.length()==0) {
		return str;
	}
	String smallS=removeX(str.substring(1,str.length()));
	if(str.charAt(0)=='x') {
		return smallS;
	}else {
		return str.charAt(0)+smallS;
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="xxxaaxx";
System.out.println(removeX(str));
	}

}
