package pkg02;

import java.util.Scanner;

public class ArrayAvg001 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String sub[]=new String[5];
		String subject;
		int grad[]=new int[5];
		int total=0;
		int avg=0;
	
		for(int c=0;c<sub.length;c++){
			System.out.println("Enter the subject name:");
			sub[c]=sc.nextLine();
			}
		
		for(int s=0;s<grad.length;s++){
			System.out.println("Enter grad for "+sub[s]);
			grad[s]=sc.nextInt();
			total=total+grad[s];
		}
		
		avg=total/grad.length;
		System.out.println("Average of student grade is "+avg);
	} 

}
