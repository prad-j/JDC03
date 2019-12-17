package pkg02;

import java.util.Scanner;

public class MCe001 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		MCe002 obj=new MCe002();
		
		System.out.println("Enter the car name.");
		String cnmr = sc.nextLine();
		
		obj.nms(cnmr);
		obj.saying();
	}

}
