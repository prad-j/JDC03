package pkg02;

public class Inht002A {
	public static void main(String args[]){
		Inht002D objD = new Inht002D();
		Inht002C objC = new Inht002C();
		Inht002B objB = new Inht002B();
		
		objD.inh01();
		System.out.println("---This is for class Inht002C-----------------------------");
		objC.inh01();
		objC.inh02();
		System.out.println("---This is for class Inht002B-----------------------------");
		objB.inh01();
		objB.inh02();
		System.out.println("---This is for class Inht002B-----------------------------");
		objB.inh03();
		
		System.out.println("*******************************");
		
		System.out.println(objB);
		
	}
}
