package pkg02;

public class SetGet001A {
	public static void main(String args[]){
		
		SetGet001B obj = new SetGet001B();
		SetGet001B obj01 = new SetGet001B(2);
		SetGet001B obj02 = new SetGet001B(3, 4);
		SetGet001B obj03 = new SetGet001B(5, 6, 7);
	
		System.out.printf("%s\n", obj.toMilitary());
		System.out.printf("%s\n", obj01.toMilitary());
		System.out.printf("%s\n", obj02.toMilitary());
		System.out.printf("%s\n", obj03.toMilitary());
		
	}
}
