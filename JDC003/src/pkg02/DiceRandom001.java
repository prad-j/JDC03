package pkg02;

import java.util.Random;

public class DiceRandom001 {
	public static void main(String args[]){
		Random dice=new Random();
		int a;
		
		for (int c=0;c<=10;c++){
			a=1+dice.nextInt(6);
			/*if a=dice.nextLine(6) is used by default it
			 starts taking values from 0 to 5*/
			System.out.println(a);
		}
		
	}
}
