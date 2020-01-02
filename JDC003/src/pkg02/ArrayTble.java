package pkg02;

public class ArrayTble {
	public static void main(String args[]){
		int ar[]={88,89,98,95,68,69,78,99};
		
		System.out.println("Index \t value");
		
		for(int c=0;c<ar.length;c++){
			System.out.println("  "+(c+1)+"\t  "+ar[c]);
		}
	}
}
