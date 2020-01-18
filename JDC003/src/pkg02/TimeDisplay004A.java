package pkg02;

public class TimeDisplay004A {
	public static void main(String args[]){
		TimeDisplay004B tmd = new TimeDisplay004B();
		System.out.println(tmd.toMilitary());
		tmd.setTime(12, 22, 30);
		System.out.println(tmd.toMilitary());
	}
}
