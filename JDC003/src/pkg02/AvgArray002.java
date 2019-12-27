package pkg02;

import java.util.Scanner;

public class AvgArray002{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String sub[]=new String[5];
		String subject;
		int grad[]=new int[5];
		int total=0;
		int s=0;
		
            for(int c=0;c<sub.length;c++){
			System.out.println("Enter the susject name:");
			sub[c]=sc.nextLine();
			
			System.out.println("Enter grad of "+ sub[c]);
			grad[s]=sc.nextInt();
			s++;
		}
	} 

}
