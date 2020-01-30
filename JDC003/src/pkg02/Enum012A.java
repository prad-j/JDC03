package pkg02;

public class Enum012A {
	public static void main(String args[]){
		for(Enum012B ppl: Enum012B.values()){
			System.out.printf("%s\t%s\t%d\n", ppl, ppl.getPlace(), ppl.getAge());
		}
	}
}
