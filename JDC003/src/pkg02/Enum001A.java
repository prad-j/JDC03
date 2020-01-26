package pkg02;

public class Enum001A {
	public static void main(String args[]){
		for(Enum001B subs: Enum001B.values()){
			System.out.printf("%s\t%s\t%s\n", subs, subs.getTheory(), subs.getPracticle());
		}
	}
}
