package pkg02;

public class Poly003A {
	public static void main(String args[]){
		Poly003D arr[] = new Poly003D[2];
		arr[0] = new Poly003B();
		arr[1] = new Poly003C();
		
		for(int i=0; i<arr.length; i++){
			arr[i].testD();
		}
		
	}
}
