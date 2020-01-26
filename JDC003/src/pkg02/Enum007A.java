package pkg02;

import java.util.EnumSet;

public class Enum007A {
	public static void main(String args[]){
		for(Enum007B athlet: Enum007B.values()){
			System.out.printf("%s\t%s\t%s\n", athlet, athlet.getSport(), athlet.getAge());
		}
		System.out.println("--------------------------");
		
		for(Enum007B athlet: EnumSet.range(Enum007B.Mary , Enum007B.Manjit)){
			System.out.printf("%s\t%s\t%s\n",athlet, athlet.getSport(), athlet.getAge());
		}
	}
	
	    
}
