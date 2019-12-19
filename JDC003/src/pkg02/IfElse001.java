package pkg02;

import java.util.Scanner;

public class IfElse001 {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of child:-");
		int a = sc.nextInt();
		
		if (a<1){
			System.out.println("Child is less than 1 yr age");
		}else{
			if(a<3){
				System.out.println("Child is more than 1 yr but less than 5 yrs age");
			}else{
				if(a<5){
					System.out.println("Child is more than 5 yr but less than 8 yrs age");
				}else{
					if(a<12){
						System.out.println("Child is more than 5 yr but less than 12 yrs age");
					}else{
						if(a<15){
							System.out.println("Child is more than 12 yr but less than 15 yrs age");
						}else{
							if (a>=15 && a<21){
								System.out.println("Hey... you r not a child... u r adolescent");
							}else{
								System.out.println("You are grown up.");
							}
						}
					}
				}
			}
		}
	}
}
