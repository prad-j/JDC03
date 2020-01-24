package pkg02;

public class Compos005A {
	private String name;
	private Compos005C bdate;
	
	public Compos005A(String iName, Compos005C theDate){
		name=iName;
		bdate=theDate;
	}
	public String toString(){
		return String.format("I am %s, My birth date is %s ", name, bdate);
	}
}
