package pkg02;

public class TimeDisplay002A {
	public static void main(String args[]){
		TimeDisplay002B TimeObj = new TimeDisplay002B();
		System.out.println(TimeObj.toMilitary());
		TimeObj.setTime(23, 59, 59);
		System.out.println(TimeObj.toMilitary());
	}
}
