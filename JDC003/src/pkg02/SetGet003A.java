package pkg02;

public class SetGet003A {
	public static void main(String args[]){
		SetGet003B obj = new SetGet003B();
		SetGet003B obj01 = new SetGet003B(1);
		SetGet003B obj02 = new SetGet003B(2,3);
		SetGet003B obj03 = new SetGet003B(4,5,6);
	
		
		System.out.printf("%s\n", obj.toMilitary());
		System.out.printf("%s\n", obj01.toMilitary());
		System.out.printf("%s\n", obj02.toMilitary());
		System.out.printf("%s\n", obj03.toMilitary());
	}
	
	
}
