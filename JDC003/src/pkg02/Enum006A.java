package pkg02;

import java.util.EnumSet;

public class Enum006A {
	public static void main(String args[]){
		for(Enum006B people: Enum006B.values()){
			System.out.printf("%s\t%s\t%s\n", people, people.getTown(), people.getAge());
		}
			
			System.out.println("------------------------------");
			System.out.println("After applying EnumSet.");
			
			for(Enum006B people: EnumSet.range(Enum006B.Abhishek, Enum006B.Dinesh)){
				System.out.printf("%s\t%s\t%s\n", people, people.getTown(), people.getAge());
			}
		
	}
}
