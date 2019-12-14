package pkg01;

import java.util.Scanner;

public class While001 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter value of x ");
		
		int x=s.nextInt();
		
		while (x<5){
			System.out.println("Statement number "+x);
			x++;
		}
	}

}
