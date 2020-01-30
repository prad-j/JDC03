package pkg02;

public class Compo001B {
	private String name;
	private Compo001C bdate;
	
	public Compo001B(String iName, Compo001C iDate){
		name=iName;
		bdate= iDate;
	}
	public String toString(){
		return String.format("My name is %s, and my birth date is %s", name, bdate);
	}
}
