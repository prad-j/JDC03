package pkg02;

import java.util.EnumSet;

public class Enum008A {
	public static void main(String args[]){
		for(Enum008B ppl: Enum008B.values()){
			System.out.printf("%s\t%s\t%s\n", ppl, ppl.getCity(), ppl.getAge());
		}
		System.out.println("------------------------");
		System.out.println("After EnumSet------------");
		
		for(Enum008B ppl: EnumSet.range(Enum008B.Harish, Enum008B.Rajendra)){
			System.out.printf("%s\t%s\t%s\n", ppl, ppl.getCity(), ppl.getAge());
		}
	}
}
