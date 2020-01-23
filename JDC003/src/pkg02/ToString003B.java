package pkg02;

public class ToString003B {
	private int day;
	private int month;
	private int year;
	
	public ToString003B(int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
		//System.out.printf("String for this object is %s",this);
	}
	public String toString(){
		return day+" "+month+" "+year;
	}
}
