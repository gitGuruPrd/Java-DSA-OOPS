package generics;

public class Pairuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pairs<String,Integer> ps= new Pairs<String,Integer>("aa", 10);
//		System.out.println(ps.getFirst()+" "+ps.getSecond());
//		Pairs <int> pI= new Pairs<int>(i10,20);-> Not allowed cause generics expect no primitive data types
//		Pairs<Integer> pI= new Pairs<Integer>(10, 20);
//		Pairs<Vehicle> pV=new Pairs<Vehicle>(new Vehicle(),new Vehicle());
		Pairs<Pairs<String,Integer>,String> p= new Pairs<Pairs<String,Integer>, String>();
		p.setFirst(ps);
		System.out.println(p.getFirst().getSecond());
		
		
	}

}
