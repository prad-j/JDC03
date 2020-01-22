package pkg02;

public class MultiConst004A {
	public static void main(String args[]){
		MultiConst004B obj = new MultiConst004B();
		MultiConst004B obj01 = new MultiConst004B(15);
		MultiConst004B obj02 = new MultiConst004B(15,18);
		MultiConst004B obj03 = new MultiConst004B(15,18,20);
		
		System.out.printf("%s\n", obj.toMilitary());
		System.out.printf("%s\n", obj01.toMilitary());
		System.out.printf("%s\n", obj02.toMilitary());
		System.out.printf("%s\n", obj03.toMilitary());
	}
}
