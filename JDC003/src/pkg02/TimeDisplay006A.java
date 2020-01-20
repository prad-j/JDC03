package pkg02;

public class TimeDisplay006A {
	public static void main(String args[]){
		TimeDisplay006B tdp = new TimeDisplay006B();
		System.out.println(tdp.td());
		tdp.setTime(21, 39, 3);
		System.out.println(tdp.td());
	}
}
