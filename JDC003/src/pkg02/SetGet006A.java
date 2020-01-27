package pkg02;

public class SetGet006A {
	public static void main(String args[]){
		SetGet006B obj=new SetGet006B();
		SetGet006B obj01=new SetGet006B(1);
		SetGet006B obj02=new SetGet006B(2,3);
		SetGet006B obj03=new SetGet006B(4,5,6);
		
		System.out.printf("%s\n", obj.toMilitary());
		System.out.printf("%s\n", obj01.toMilitary());
		System.out.printf("%s\n", obj02.toMilitary());
		System.out.printf("%s\n", obj03.toMilitary());
	}
}
