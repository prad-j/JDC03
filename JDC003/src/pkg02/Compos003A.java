package pkg02;

public class Compos003A {
	private String name;
	private Compos003C bdate;
	
	public Compos003A(String iName, Compos003C theDate){
		name=iName;
		bdate=theDate;
	}
	public String toString(){
		return String.format("I am %s, My birthdate is ",name, bdate);
	}
}
