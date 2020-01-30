package pkg02;

public class Compo002B {
	private String name;
	private Compo002C date;
	
	public Compo002B(String iName, Compo002C iDate){
		name=iName;
		date=iDate;
	}
	public String toString(){
		return String.format("I am %s, and my birth date is %s ", name, date);
	}
}
