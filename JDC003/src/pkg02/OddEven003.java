package pkg02;

import java.util.Scanner;

public class OddEven003 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		
		if(n%2==0){
			System.out.println("The number is even.");
		}else{
			System.out.println("The number is odd.");
		}
		
	}

}
