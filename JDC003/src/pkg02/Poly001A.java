package pkg02;

public class Poly001A {
	public static void main(String args[]){
		Poly001B obj = new Poly001B();
		Poly001C obj1 = new Poly001C();
		Poly001D obj2 = new Poly001D();
		
		obj.polm001B();
		obj1.polm001C();
		obj2.polm001D();
		System.out.println("--------------------------------------");
		obj.polm001D();
		obj1.polm001D();
	}
}
