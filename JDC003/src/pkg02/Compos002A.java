package pkg02;

public class Compos002A {
	private String name;
	private Compos002C bdate;
	
	public Compos002A(String iName, Compos002C theDate){
		name=iName;
		bdate=theDate;
	}
	public String toString(){
		return String.format("My name is %s, My birthdate is %s", name, bdate);
	}
}
