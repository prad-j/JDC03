package pkg02;

public class Compos001A {
	public static void main(String args[]){
		Compos001C obj01 = new Compos001C(1,2,3);
		Compos001B obj02 = new Compos001B("Prad", obj01); 
		
		System.out.println(obj02);
	}
}
