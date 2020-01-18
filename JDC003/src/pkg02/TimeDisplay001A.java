package pkg02;

import java.sql.Time;

public class TimeDisplay001A {
	public static void main(String args[]){
		TimeDisplay001B TimeObj = new TimeDisplay001B();
		System.out.println(TimeObj.toMilitary());
		TimeObj.setTime(23, 59, 59);
		System.out.println(TimeObj.toMilitary());
	}
}
