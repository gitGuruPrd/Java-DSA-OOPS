package recursion;

public class TowerOfHanoiPrac {
public static void towerOfHanoi(int n,char s,char h,char d) {
	if(n==1) {
		System.out.println(s+"to"+d);
		return;
	}
	towerOfHanoi(n-1, s, d, h);
	System.out.println(s+"to"+d);
	towerOfHanoi(n-1, h, s, d);
	
	
	
}
	public static void main(String[] args) {
		char s='a',h='b',d='c';
		// TODO Auto-generated method stub
towerOfHanoi(3, s, h, d);
	}

}
