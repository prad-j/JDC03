package pkg02;

public class Poly004A {
	public static void main(String args[]){
		Poly004D arr[] = new Poly004D[2];
		arr[0] = new Poly004C();
		arr[1] = new Poly004B();
		
		for(int i=0; i<arr.length; i++){
			arr[i].testD();
		}
	}
}
