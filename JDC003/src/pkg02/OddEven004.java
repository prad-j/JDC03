package pkg02;

import java.util.Scanner;

import java.util.Scanner;

public class OddEven004 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value:");
		int n=sc.nextInt();
	    
		if(n==1){
			System.out.println("1 is neither odd or even.");
		}else if(n%2==0){
			System.out.println("Number is even.");
		}else{
			System.out.println("Number is odd.");
		}
	}
		
	
}
