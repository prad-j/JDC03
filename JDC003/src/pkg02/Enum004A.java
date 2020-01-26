package pkg02;

public class Enum004A {
	public static void main(String args[]){
		for(Enum004B adplace: Enum004B.values()){
			System.out.printf("%s\t%s\t%02d\n", adplace, adplace.getPlace(), adplace.getAge());
		}
	}
}
