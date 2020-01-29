package pkg02;

public class ToString009B {
	private int day;
	private int month;
	private int year;
	
	public ToString009B(int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
		System.out.printf("Tomorrow is  %s\n", this);
	}
	public String toString(){
		return String.format("%d-%d-%d", day, month, year);
	}
}
