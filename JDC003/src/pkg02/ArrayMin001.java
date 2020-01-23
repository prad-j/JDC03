package pkg02;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMin001 {
	public static void main(String args[]){
		Integer arr[] ={55,6, -1,98,32,23};
		
		int min = Collections.min(Arrays.asList(arr));
		System.out.println("Minimum value in array is "+min);
	}
}
