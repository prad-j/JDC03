package pkg02;

public class Compo002A {
	public static void main(String args[]){
		Compo002C obj = new Compo002C(1,2,3);
		Compo002B obj1 = new Compo002B("prad", obj);
		
		System.out.println(obj);
		System.out.println(obj1);
	}
}
