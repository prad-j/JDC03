package pkg02;

public class MultiConst005A {
	public static void main(String args[]){
		MultiConst005B obj=new MultiConst005B();
		MultiConst005B obj01=new MultiConst005B(15);
		MultiConst005B obj02=new MultiConst005B(15,16);
		MultiConst005B obj03=new MultiConst005B(15,16,17);
		
		System.out.printf("%s\n", obj.toMilitary());
		System.out.printf("%s\n", obj01.toMilitary());
		System.out.printf("%s\n", obj02.toMilitary());
		System.out.printf("%s\n", obj03.toMilitary());
	}
}
