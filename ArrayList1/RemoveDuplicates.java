package ArrayList1;
import java.util.ArrayList;

public class  RemoveDuplicates {
public static ArrayList<Integer> removeDuplicates(int[]arr){
ArrayList<Integer> res = new ArrayList<Integer>();
res.add(arr[0]);
for(int i=1;i<arr.length;i++) {
	if(arr[i]!=arr[i-1]) {
		res.add(arr[i]);
	}
}
return res;
}
	public static void main(String[] args) {
		int[] arr= {1,2,3,3,4,4,4,5,5,6};
		ArrayList<Integer> ans = removeDuplicates(arr);
		for(int i:ans) {
			System.out.println(i);
		}

	}

}
