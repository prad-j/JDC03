package pkg02;

import java.util.Random;

public class ArrEleCounter001 {
	public static void main(String args[]){
		Random rd=new Random();
		int fre[]=new int[7];
		
		for(int c=0;c<30;c++){
			++fre[1+rd.nextInt(6)];
		}
		System.out.println("Face \t Frequecy");
		
		for(int face=1;face<fre.length;face++){
			System.out.println("  "+face+"\t    "+fre[face]);
		}
	}
}
