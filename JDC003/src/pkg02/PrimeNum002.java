package pkg02;

import java.util.Scanner;

public class PrimeNum002 {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int n, m;
		int f=0;
		
		System.out.println("Enter the value for n:");
		n=sc.nextInt();
		
		m=n/2;
		
		if(n==0||n==1){
			System.out.println(n+" is not a prime number.");
		}else{
			for(int i=2; i<m; i++){
				if(n%i==0){
					System.out.println(n+" is not a prime number.");
					f=1;
					break;
				}
			}
			if(f==0){
				System.out.println(n+" is a prime number.");
			}
		}
		
	}

}
