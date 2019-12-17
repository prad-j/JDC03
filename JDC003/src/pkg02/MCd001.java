package pkg02;

import java.util.Scanner;

public class MCd001 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String fn=sc.nextLine();
		
		System.out.println("Enter your last name:");
		String ln=sc.nextLine();
		
		System.out.println("Enter your age:");
		int a=sc.nextInt();
		
		MCd002 nmobj = new MCd002();
		nmobj.nmPrint(fn, ln, a);
	}

}
