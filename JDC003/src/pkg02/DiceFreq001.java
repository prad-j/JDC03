package pkg02;

import java.util.Random;

public class DiceFreq001 {
	public static void main(String args[]){
		Random rd=new Random();
		int frq[]=new int[7];
		
		for(int roll=1;roll<=1000;roll++){
			++frq[1+rd.nextInt(6)];
		}
		System.out.println("Face\tFrequency");
		
		for(int face=1;face<frq.length;face++){
			System.out.println(face+"\t"+frq[face]);
		}
	}
}
