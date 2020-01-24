package pkg02;

public class Compos001B {
	private String name;
	private Compos001C bdate;
	
	public Compos001B(String iName, Compos001C date){
		name=iName;
		bdate=date;
	}
	public String toString(){
		return String.format("My name is %s, My birthdate is %s",name, bdate);
	}
}
