package Linkedlist;

import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list= new LinkedList<Integer>();
		for(int i= 0;i<5;i++) {
			list.add(i+10);
		}
		/*for (Integer integer : list) {
		System.out.print(integer+" ");	
		}*/
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}
