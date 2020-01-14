package pkg02;

public class VarArg002 {
	public static void main(String args[]){
		System.out.println(calc(99,89,98,88,97));
	}
	public static double calc(double...avg){
		double total=0;
		for(double z:avg){
			total+=z;
		}
		return total/avg.length;
	}
}
