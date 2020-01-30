package pkg02;

public class Compo003A {
	public static void main(String args[]){
		Compo003C obj = new Compo003C(1,2,3);
		Compo003B rfo = new Compo003B("Prad", obj);
		
		System.out.println(rfo);
	}
}
