package pkg02;

public class ThisTest01A {
	public static void main(String args[]){
		ThisTest01B obj = new ThisTest01B();
		obj.setTime(11, 12, 13);
		System.out.println(obj.toMilitary());
	}
}
