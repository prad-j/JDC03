package pkg02;

public class MultiConst003A {
	public static void main(String args[]){
		MultiConst003B obj = new MultiConst003B();
		MultiConst003B obj01 = new MultiConst003B(14);
		MultiConst003B obj02 = new MultiConst003B(14,15);
		MultiConst003B obj03 = new MultiConst003B(14,15,16);
		
		System.out.printf("%s\n", obj.toMilitary());
		System.out.printf("%s\n", obj01.toMilitary());
		System.out.printf("%s\n", obj02.toMilitary());
		System.out.printf("%s\n", obj03.toMilitary());
	}
}
