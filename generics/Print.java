package generics;

public class Print {
	public static <T extends PrintInterface> void printArray(T arr[]) {
		for (T t : arr) {
//			System.out.print(t+" ");
			t.print();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Character []arr= {'1','2','3','4'};
//printArray(arr);
Vehicle v[] =new Vehicle[5];
for(int i=0;i<5;i++) {
	v[i]=new Vehicle(10*i, "ab");
	
}
printArray(v);
	}

}
