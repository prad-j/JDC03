package pkg02;

public class Compos004B {
	public static void main(String args[]){
		Compos004C obj = new Compos004C(4,1,5);
		Compos004A obj01 = new Compos004A("Prad", obj);
		
		System.out.println(obj01);
	}
}
