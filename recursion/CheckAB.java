package recursion;

public class CheckAB {
	/*
	 * 
	 *  a. The string begins with an 'a'
		b. Each 'a' is followed by nothing or an 'a' or "bb"
		c. Each "bb" is followed by nothing or an 'a'
	 * 
	 * 1- if length of the sting is 0 then true , 
this will be the terminating point 
,like the base case

2- we will add a check for 
point: a 
in the question that is ,
the  0th character should ,must be an a

so we will add a check for it, 
if the 0th char is not a return false from there

3- then we will check the point b that is                                    
. Each 'a' is followed by nothing or an 'a' or "bb"                            
so if the first three character is "abb"
then we will call recursion from the substring 3                                         

else                                                      

4- we will call the recursion from the substrigng 1 only

follow thest 4 steps
	 * 
	 * */
//	public static boolean splitString() {
//		
//	}
//		if(s.length()==1&&s.charAt(0)=='a') {
//			return true;
//		}else if(s.length()!=1) {
//			return false;
//		}else if(s.length()==0) {
//			return true;
//		}else if(s.length()==1&&s.charAt(0)!='a') {
//			return false;
//		}
//		String a=s.substring(0,3);
//		String b =s.substring(a.length(),s.length());
//		boolean out=false;
//		if(b.length()>=3) {
//			out=checkAB(b);
//			return out;
//		}
//		if(a.charAt(0)=='a'&&a.charAt(1)=='b'&&a.charAt(2)=='b') {
//			return true;
//		}else {
//			return false;
//		}
	public static boolean checkAB(String input) {
		if(input.length()==0) {
			return true;
		}
		
		if(input.charAt(0)=='a') {
			if(input.substring(1).length()>1&&input.substring(1,3).equals("bb")) {
				boolean out =checkAB(input.substring(3));
				return out;
			}else {
				return checkAB(input.substring(1));
			}
		}else {
			return false;
		}
			
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkAB("aabb"));
	}

}
