package pkg02;

public class Enum010A {
	public static void main(String args[]){
		for(Enum010B ppl: Enum010B.values()){
			System.out.printf("%s\t%s\t%s\n", ppl, ppl.getProf(), ppl.getAge());
		}
	}
}
