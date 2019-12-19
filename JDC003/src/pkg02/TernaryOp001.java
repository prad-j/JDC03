package pkg02;
import java.util.Scanner;
public class TernaryOp001 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age:");
		
		int age=s.nextInt();
		System.out.println(age>=60?"You are senior citizen.":"You are not senior citizen.");
	}

}
