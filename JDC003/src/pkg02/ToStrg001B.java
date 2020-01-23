package pkg02;

public class ToStrg001B {
	private int day;
	private int month;
	private int year;
	
	public ToStrg001B(int d, int m, int y){
		day = d;
		month = m;
		year = y;
		
		System.out.printf("Constructor for this object is %s\n",this);
	} 
	public String toString(){
		return String.format("%d:%d:%d", day, month, year);
	}
}
