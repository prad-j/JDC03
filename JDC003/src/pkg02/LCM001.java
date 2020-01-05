package pkg02;

import java.util.Scanner;

public class LCM001 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a, b;
		
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		
		for(int i=1;i<=(a*b);i++){
			if(i%a==0&&i%b==0){
				System.out.println("LCM of "+a+" & "+b+" is "+i);
				break;
			}
		}
	}

}
