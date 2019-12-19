package pkg02;

import java.util.Scanner;

public class ElseIf001 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age of a passenger:");
		int age = s.nextInt();
		
		if (age<3)
			System.out.println("You don't need ticket, your r less than 3 yrs age");
		else if(age>=3 && age<12)
			System.out.println("You don't need full ticket, pay for half ticket charges.");
		else if(age>=12 && age<60)
			System.out.println("You are an adult passenger. Pay for full ticket charges.");
		else
			System.out.println("You are senior citizen. To avail benefits, check the check box for Senior Citizen");
	}

}
