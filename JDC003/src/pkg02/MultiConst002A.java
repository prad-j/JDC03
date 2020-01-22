package pkg02;

public class MultiConst002A {
	public static void main(String args[]){
		MultiConst002B obj = new MultiConst002B();
		MultiConst002B obj01 = new MultiConst002B(13);
		MultiConst002B obj02 = new MultiConst002B(13, 15);
		MultiConst002B obj03 = new MultiConst002B(13, 15, 16);
		
		System.out.printf("%s\n", obj.toMilitary());
		System.out.printf("%s\n", obj01.toMilitary());
		System.out.printf("%s\n", obj02.toMilitary());
		System.out.printf("%s\n", obj03.toMilitary());
	}
}
