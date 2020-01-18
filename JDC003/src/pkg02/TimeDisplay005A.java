package pkg02;

public class TimeDisplay005A {
	public static void main(String args[]){
		TimeDisplay005B tmd = new TimeDisplay005B();
		System.out.println(tmd.toMilitary());
		tmd.setTime(23, 2, 3);
		System.out.println(tmd.toMilitary());
	}
}
