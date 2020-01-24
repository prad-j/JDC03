package pkg02;

public class Compos005B {
	public static void main(String args[]){
		Compos005C obj = new Compos005C(1,2,3);
		Compos005A obj01 = new Compos005A("Prad", obj);
		
		System.out.println(obj01);
	}
}
