package pkg02;

public class Compos003C {
	private int day;
	private int month;
	private int year;
	
	public Compos003C (int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
		System.out.printf("The constructor for this is %s\n", this);
	}
	public String toString(){
		return String.format("%d-%d-%d",day, month, year);
	}
}
