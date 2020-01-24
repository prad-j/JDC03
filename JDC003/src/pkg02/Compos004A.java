package pkg02;

public class Compos004A {
	private String name;
	private Compos004C bdate;
	
	public Compos004A(String iName, Compos004C theDate){
		name=iName;
		bdate=theDate;
	}
	public String toString(){
		return String.format("I am %s, My birth date is %s", name, bdate);
	}
}
