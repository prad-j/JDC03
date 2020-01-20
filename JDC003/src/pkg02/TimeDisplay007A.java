package pkg02;

public class TimeDisplay007A {
	public static void main(String args[]){
		TimeDisplay007B tdm = new TimeDisplay007B();
		tdm.setTime(13, 5, 9);
		System.out.println(tdm.toMilitary());
		System.out.println(tdm.toCivil());
	}
}
