package pkg02;

public class Compo001A {
	public static void main(String args[]){
		Compo001C obj = new Compo001C(4,5,6);
		Compo001B obj1= new Compo001B("Prad", obj);
		
		System.out.println(obj1);
	}
}
