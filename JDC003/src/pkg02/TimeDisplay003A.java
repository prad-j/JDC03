package pkg02;

public class TimeDisplay003A {
	public static void main(String args[]){
		TimeDisplay003B Timet = new TimeDisplay003B();
		System.out.println(Timet.toMilitary());
		Timet.stm(20, 02, 03);
		System.out.println(Timet.toMilitary());
	}
}
