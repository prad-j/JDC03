package pkg02;

public class Compos006A {
	public static void main(String args[]){
		Compos006C obj = new Compos006C(3,2,1);
		Compos006B otr = new Compos006B("Prad", obj);
		
		System.out.println(otr);
	}
}
