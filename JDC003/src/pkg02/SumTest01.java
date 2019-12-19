package pkg02;
import java.util.Scanner;
public class SumTest01 {
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a");
	int  a = s.nextInt();
	System.out.println("Enter b");
	int  b = s.nextInt();
	
	int c=a+b;
	int d=2*c;
	
	if (a<100 || b<200){
		System.out.println("The sum is "+c);
	}else{
		System.out.println("The sum is "+d);
	}

	}

}
