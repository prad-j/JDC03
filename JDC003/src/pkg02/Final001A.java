package pkg02;

public class Final001A {
	public static void main(String args[]){
		Final001B obj = new Final001B(10);
		
		for(int i=0; i<5; i++){
			obj.add();
			System.out.printf("%s", obj);
		}
	}
}
