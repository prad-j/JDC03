package pkg02;

import java.util.Scanner;

public class NumSum001 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n;
		
		System.out.println("Enter the number to calculate the sub of it's digits:");
        
		n=sc.nextInt();
		
		for(sum=0;n!=0;n/=10){
			sum+=n%10;
		}
		System.out.println("Sum of all the digits of the entered number is "+sum);
		 
	}	
	
}
