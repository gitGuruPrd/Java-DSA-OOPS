package ArrayList1;

import java.util.ArrayList;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(40);
		System.out.println(arr.get(arr.size()-1));
		arr.add(1,69);
		System.out.println(arr.get(3));
		arr.set(1, 20);
		arr.remove(2);
//		to remove object
		Integer it =10;
		arr.remove(it);
		arr.add(1,19);
		for (int i : arr) {
//			i here is value of an element
			System.out.print(i+" ");
		}
		for(int i=0;i<arr.size();i++) {
//			i here is value of index
			System.out.print( '\n'+" "+arr.get(i));
		}
	}

}
