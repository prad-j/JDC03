package pkg02;

public class Compos006B {
	private String name;
	private Compos006C bdate;
	
	public Compos006B(String iName, Compos006C theDate){
		name=iName;
		bdate=theDate;
		
		System.out.printf("This is first statement-- %s\n",this);
	}
	public String toString(){
		return String.format("I am %s, My birth date is %s", name, bdate);
	}
}
