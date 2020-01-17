package pkg02;

public class VarLArg001 {
	public static void main(String args[]){
		System.out.println(avg(80,90,70,60,50));
	}
	public static int avg(int...nums){
		int total=0;
		for(int x:nums){
			total+=x;
		}
		return total/nums.length;
	}
}
