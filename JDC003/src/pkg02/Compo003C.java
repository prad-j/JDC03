package pkg02;

public class Compo003C {
	private int day;
	private int month;
	private int year;
	
	public Compo003C(int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
		System.out.printf("This is for the Constructor %s\n", this);
	}
	public String toString(){
		return String.format("%d-%d-%d", day, month, year);
	}
	
}
