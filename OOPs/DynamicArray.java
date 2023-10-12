package OOPs;

public class DynamicArray {
private int[] data;
private int nextElementIndex;
public DynamicArray() {
	data = new int[5];
	nextElementIndex=0;
}
public int size() {
	return nextElementIndex;
}
public boolean isEmpty() {
	return nextElementIndex==0;
}
public int get(int i) {
	if(i>=nextElementIndex) {
		return -1;
	}
	return data[i];
}
}
