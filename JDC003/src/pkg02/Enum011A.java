package pkg02;

public class Enum011A {
	public static void main(String args[]){
		for(Enum011B ppl: Enum011B.values()){
			System.out.printf("%s\t%s\t%s\n", ppl, ppl.getPlace(), ppl.getAge());
		}
	}
}
