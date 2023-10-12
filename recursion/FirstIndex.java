package recursion;

public class FirstIndex {
	public static int firstIndex(int[]a,int x,int si) {
		
		if(si==a.length){
            return -1;
        }
        if(a[si]==x){
            return si;
        }
        int k=firstIndex(a,x,si+1);
        return k;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
