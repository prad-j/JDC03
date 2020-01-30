package pkg02;

import java.util.EnumSet;

public class Enum013A {
	public static void main(String args[]){
		for(Enum013B ppl: EnumSet.range(Enum013B.Suresh, Enum013B.Kamlesh)){
			System.out.printf("%s\t%s\t%s\n", ppl, ppl.getPlace(), ppl.getAge());
		}
	}
}
