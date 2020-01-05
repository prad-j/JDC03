package pkg02;

import java.util.Scanner;

public class Factors001 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to find factors:");
		
		int n=sc.nextInt();
		
		for(int c=2;c<n/2;c++){
			if(n%c==0){
				System.out.println(c);
			}
		}
		
	}

}
