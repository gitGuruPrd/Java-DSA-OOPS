package OOPs;

public class GetSet {
private int id;
public String name;
public int getId() {
	return this.id;
}
public void setId(int n) {
	if(id>0) {
		this.id=n;
	}else {
		System.out.println("Invalid Id");
		return;
	}
}
}
