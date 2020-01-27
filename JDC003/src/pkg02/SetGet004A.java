package pkg02;

public class SetGet004A {
	public static void main(String args[]){
		SetGet004B obj = new SetGet004B();
		SetGet004B obj01 = new SetGet004B(1);
		SetGet004B obj02 = new SetGet004B(2,3);
		SetGet004B obj03 = new SetGet004B(4,5,6);
		
		System.out.printf("%s\n", obj.toMilitary());
		System.out.printf("%s\n", obj01.toMilitary());
		System.out.printf("%s\n", obj02.toMilitary());
		System.out.printf("%s\n", obj03.toMilitary());
	}
}
