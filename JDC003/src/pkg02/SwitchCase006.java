package pkg02;

import java.util.Scanner;

public class SwitchCase006 {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the food item number: ");
		
		int i = sc.nextInt();
		
		switch (i){
		case 1:
			System.out.println("Vadapav: 18");
			break;
		case 2:
			System.out.println("Samosapav: 17");
			break;
		case 3:
			System.out.println("Vada: 16");
			break;
		case 4:
			System.out.println("Samosa: 16");
			break;
		case 5:
			System.out.println("Pakoda: 20");
			break;
		case 6:
			System.out.println("Dhokla: 35");
			break;
		case 7:
			System.out.println("Phafada: 25");
			break;
		case 8:
			System.out.println("Masal pav: 23");
			break;
		case 9:
			System.out.println("Jalebi: 33");
			break;
		case 10:
			System.out.println("Tea: 10");
			break;
		default:
			System.out.println("Invalid entry!");
			
		}
		
	}
}
