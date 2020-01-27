package pkg02;

public class SetGet005A {
	public static void main(String args[]){
		SetGet005B obj = new SetGet005B();
		SetGet005B obj01 = new SetGet005B(1);
		SetGet005B obj02 = new SetGet005B(2, 3);
		SetGet005B obj03 = new SetGet005B(3, 4, 5);
		
		System.out.printf("%s\n", obj.toMilitary());
		System.out.printf("%s\n", obj01.toMilitary());
		System.out.printf("%s\n", obj02.toMilitary());
		System.out.printf("%s\n", obj03.toMilitary());
	}
}
