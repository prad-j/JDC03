package pkg02;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMinMax001 {
	public static void main(String array[]){
		Integer ar[]={10,20,23,21,1,245,95,35,4564,22,9};
		
		int min=Collections.min(Arrays.asList(ar));
		int max=Collections.max(Arrays.asList(ar));
		
		System.out.println("Minimum value in the array is "+min);
		System.out.println("Maximum value in the array is "+max);
	}

}
