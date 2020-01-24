package pkg02;

public class ToString006B {
	private int day;
	private int month;
	private int year;
	
	public ToString006B(int d, int m, int y){
		day=d;
		month=m;
		year=y;
	}
	public String toString(){
		return String.format("%d/%d/%d", day, month, year);
	}
}
