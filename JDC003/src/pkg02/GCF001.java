package pkg02;

import java.util.Scanner;

public class GCF001 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a, b;
		int g=0;
		
		System.out.println("Enter value of first number:");
		a=sc.nextInt();
		System.out.println("Enter value of second number:");
		b=sc.nextInt();
		
		for(int i=1;i<=a&&i<=b;++i){
			if(a%i==0 && b%i==0)
				g=i;
		}
		
		System.out.println("GCD of "+a+" & "+b+" is "+g);
	}

}
