package pkg02;

public class ToString002B {
	private int day;
	private int month;
	private int year;
	
	public ToString002B(int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
		System.out.printf("This is for constructor %s\n", this);
	}
	public String toString(){
		return String.format("%d-%d-%d", day, month, year);
	}
}
