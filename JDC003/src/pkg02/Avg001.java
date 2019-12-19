package pkg02;
import java.util.Scanner;
public class Avg001 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int grad;
		int total=0;
		int avg;
		int counter=0;
		
		while(counter<10){
			grad=s.nextInt();
			total=total+grad;
			counter++;
		}
		avg=total/10;
		System.out.println("Average is "+avg);
		
	}

}
