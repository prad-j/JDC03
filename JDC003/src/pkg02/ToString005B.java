package pkg02;

public class ToString005B {
	private int day;
	private int month;
	private int year;
	
	public ToString005B(int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
		System.out.printf("Constructor for this is %s", this);
	}
	//public String toString(){
		//return String.format("%d/%d/%d", day, month, year);
	//}
	public String toString(){
		return day+"-"+month+"-"+year;
	}
}
