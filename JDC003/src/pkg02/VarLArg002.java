package pkg02;

public class VarLArg002 {
	public static void main(String args[]){
		System.out.println(sum(98,99,97,96,99,70));
	}
	public static int sum(int...val){
		int total=0;
		for(int x:val)
			total+=x;
		return total;
	}
	
}
