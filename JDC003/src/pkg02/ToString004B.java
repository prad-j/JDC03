package pkg02;

public class ToString004B {
	private int day;
	private int month;
	private int year;
	
	public ToString004B(int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
		System.out.printf("This is String for constructor %s", this);
	}
	public String toString(){
		return String.format("%d:%d:%d", day, month, year);
	}
}
