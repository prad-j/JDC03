package pkg02;

public class Compos003B {
	public static void main(String args[]){
		Compos003C obj = new Compos003C(1,4,7);
		Compos003A obj01 = new Compos003A("Prad", obj);
		
		System.out.println(obj01);
	}
}
