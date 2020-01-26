package pkg02;

import java.util.Scanner;

public class SwitchCase004 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.println("Enter the food item number:");
		
		i = sc.next().charAt(0);
		
		switch (i){
		case '1':
			System.out.println("Chees Burger - 10");
			break;
		case '2':
			System.out.println("Chicken Burger - 12");
			break;
		case '3':
			System.out.println("Chees Pizza - 13");
			break;
		case '4':
			System.out.println("Chicket Pizza - 14");
			break;
		case '5':
			System.out.println("Noodle Burger - 15");
			break;
		case '6':
			System.out.println("Noodle Pizza - 16");
			break;
		case '7':
			System.out.println("Manchurian Pizza - 17");
			break;
		default:
			System.out.println("Invalid entry");
			break;
		}
		
	}
}
