package pkg02;
import java.util.Scanner;
public class Factor001 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value to find factor.");
		int a=sc.nextInt();
		System.out.println();
		System.out.println("Following are factors of "+a);
		
		for(int i=2;i<=a/2;i++){
			if(a%i==0){
				System.out.println(i);
			}
		}
	}
	
}
