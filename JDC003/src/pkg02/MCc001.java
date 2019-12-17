package pkg02;

import java.util.Scanner;

public class MCc001 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String nm=sc.nextLine();
		
		MCc002 nmObj = new MCc002();
		nmObj.sayNm(nm);
	}

}
