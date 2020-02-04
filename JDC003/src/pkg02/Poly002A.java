package pkg02;

public class Poly002A {
	public static void main(String args[]){
		Poly002D obj = new Poly002B();
		Poly002B obj1 = new Poly002B();
		Poly002C obj2 = new Poly002C();
		
		obj.pol02D();
		System.out.println("-----------------------");
		obj1.pol02B();
		obj1.pol02D();
		System.out.println("-----------------------");
		obj2.pol02C();
		obj2.pol02D();
		
		System.out.println("-----------------------");
		
		Poly002D arr[] = new Poly002D[2];
		arr[0] = new Poly002B();
		arr[1] = new Poly002C();
		
		for(int i=0; i<arr.length; i++){
			arr[i].pol02D();
		}
	}
}
