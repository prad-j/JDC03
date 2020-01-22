package pkg02;

public class MultiConst001A {
	public static void main(String args[]){
		
		MultiConst001B obj = new MultiConst001B();
		MultiConst001B obj01 = new MultiConst001B(5);
		MultiConst001B obj02 = new MultiConst001B(5, 50);
		MultiConst001B obj03 = new MultiConst001B(5, 50, 10);
		
		System.out.printf("%s\n", obj.toMilitary());
		System.out.printf("%s\n", obj01.toMilitary());
		System.out.printf("%s\n", obj02.toMilitary());
		System.out.printf("%s\n", obj03.toMilitary());
		
	}
}
