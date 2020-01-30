package pkg02;

public class Compo003B {
	private String name;
	private Compo003C date;
	
	public Compo003B(String iName, Compo003C iDate){
		name=iName;
		date=iDate;
		
	}
	public String toString(){
		return String.format("My name is %s and my birthdate is %s ", name, date);
	}
}
