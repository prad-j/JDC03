package pkg02;

public class Compo002C {
	private int day;
	private int month;
	private int year;
	
	public Compo002C(int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
		System.out.printf("This is for String %s\n ",this);
	}
	public String toString(){
		return String.format("%d-%d-%d", day, month, year);
	}
}
