package pkg02;

import java.util.Scanner;

public class SwitchCase003 {
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		
		String item;
		
		System.out.println("Enter the item-");
		item=sc.nextLine();
		
		switch (item){
		case "vadapav":
			System.out.println("Vadapav - 18");
			break;
		case "samosa":
			System.out.println("Samosa - 16");
			break;
		case "jalebi":
			System.out.println("Jalebi - 50");
			break;
		case "pakoda":
			System.out.println("Pakods - 20");
			break;
		default:
			System.out.println("Invalid entry");
			break;
		
		}
		
		
	}
}
