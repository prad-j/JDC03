package pkg02;

public class VarArg001 {
	public static void main(String args[]){
		System.out.println(avg(100,100,100,100,100,95));
		
	}
	public static double avg(double...nums){
		double total=0;
		for(double x:nums){
			total+=x;
		}
		return total/nums.length;
	}

}
