package pkg02;

import java.util.EnumSet;

public class Enum009A {
	public static void main(String args[]){
		for(Enum009B ppl: Enum009B.values()){
			System.out.printf("%s\t%s\t%s\n", ppl, ppl.getCity(), ppl.getAge());
		}
		System.out.println();
		System.out.println("After EnumSet ------------------");
		System.out.println();
		for(Enum009B ppl: EnumSet.range(Enum009B.Girish, Enum009B.Rajendra)){
			System.out.printf("%s\t%s\t%s\n", ppl, ppl.getCity(), ppl.getAge());
		}
	}
	
}
