package pkg02;

public class Enum002A {
	public static void main(String args[]){
		for(Enum002B duration: Enum002B.values()){
			System.out.printf("%s\t%s\t%s\n", duration, duration.getCity(), duration.getTime());
		}
	}
}
