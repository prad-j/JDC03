package pkg02;

import java.util.Scanner;

public class SumArrayEle002 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[7];
		int total=0;
		
		for(int i=0;i<ar.length;i++){
			System.out.println("Enter value for element number "+(i+1));
			ar[i]=sc.nextInt();
		}
		for(int n=0; n<ar.length; n++){
			total=total+ar[n];
		}
		System.out.println();
		System.out.println("Total of all the elements is "+total);
	}

}
