package pkg02;

public class Compos002B {
	public static void main(String args[]){
		Compos002C obj = new Compos002C(3,2,1);
		Compos002A obj01 = new Compos002A("Prad", obj);
		
		System.out.println(obj01);
	}
}
