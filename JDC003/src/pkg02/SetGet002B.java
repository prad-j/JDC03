package pkg02;

public class SetGet002B {
	public static void main(String args[]){
		SetGet002A obj = new SetGet002A();
		SetGet002A obj01 = new SetGet002A(2);
		SetGet002A obj02 = new SetGet002A(3, 4);
		SetGet002A obj03 = new SetGet002A(5, 6, 7);
		
		System.out.printf("%s\n", obj.toMilitary());
		System.out.printf("%s\n", obj01.toMilitary());
		System.out.printf("%s\n", obj02.toMilitary());
		System.out.printf("%s\n", obj03.toMilitary());
	}
}
