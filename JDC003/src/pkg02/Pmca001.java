package pkg02;

import java.util.Scanner;

public class Pmca001 {
	public static void main(String args[]){
		
		Scanner sr=new Scanner(System.in);
		
		System.out.println("Enter ur name ");
		
		String sn=sr.nextLine();
		
		Pmca002 pnno = new Pmca002();
		pnno.pName(sn);
	}

}
