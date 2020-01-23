package pkg02;

import java.util.Arrays;
import java.util.Collections;


public class ArrayMax001 {
	public static void main(String args[]){
		Integer ar[]={5,6,1,0,88,9,99,69};
		
		int max = Collections.max(Arrays.asList(ar));
		System.out.println("Max value in array is "+max);
	}
}
