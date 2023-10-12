package generics;
//use of generics
public class Pairs <T,S> {/*
multiple generics*/
private T first;
private S second;
public Pairs() {
	
}
public  Pairs(T first,S second) {
	this.first=first;
	this.second=second;
}
public T getFirst() {
	return this.first;
}
/**
 * @return the second
 */
public S getSecond() {
	return second;
}
public void setFirst(T first) {
	this.first = first;
}
public void setSecond(S second) {
	this.second = second;
}

}
