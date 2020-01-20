package pkg02;

public class TimeDisplay008A {
	public static void main(String args[]){
		TimeDisplay008B tdf = new TimeDisplay008B();
		tdf.setTime(13, 26, 17);
		System.out.println(tdf.to24Hr());
		System.out.println();
		System.out.println(tdf.to12Hr());
	}
}
