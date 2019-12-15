package pkg02;

import java.util.Scanner;

public class MMc001 {
	public static void main(String args[]){
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter the name of car");
		String tcr=sr.nextLine();
		
		MMc002 objn= new MMc002();
		objn.setCar(tcr);
		
		objn.say();
		
		
	}
}
