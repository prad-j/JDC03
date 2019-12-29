package pkg02;

import java.util.Scanner;

public class ArrayTbleScnr001 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double total=0;
		double percentage=0;
		
		String sub[]=new String [5];
		double grade[]=new double[5];
		
		for(int c=0;c<sub.length;c++){
			System.out.println("Enter the name of subject "+(c+1));
			sub[c]=sc.nextLine();
		}
		System.out.println();
		for (int s=0;s<sub.length;s++){
			System.out.println("Enter the grade for subject "+sub[s]);
			grade[s]=sc.nextDouble();
		}
		System.out.println();
		
		System.out.println("Subject\tgrade");
		System.out.println("------------------");
		
		for (int p=0;p<sub.length;p++){
			System.out.println(sub[p]+"  \t"+grade[p]);
		}
		
		System.out.println();
		for(int t=0;t<sub.length;t++){
			total=total+grade[t];
		}
		System.out.println("Total marks obtained are "+total);
		System.out.println();
		percentage=(total*100)/600;
		System.out.println("Percentage of the student are "+percentage);
	}

}
