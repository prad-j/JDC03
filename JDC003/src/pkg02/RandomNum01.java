package pkg02;

import java.util.Random;

public class RandomNum01 {
	public static void main(String args[]){
		Random rd=new Random();
		int num;
		
		for(int c=0;c<10;c++){
			num=1+rd.nextInt(6);
			
			System.out.println(num);
		}
	}

}
