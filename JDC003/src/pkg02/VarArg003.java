package pkg02;

public class VarArg003 {
	public static void main(String args[]){
		System.out.println(reg(98,66,55,68,64,99));
	}
	public static double reg(double...termn){
		double total=0;
		for(double x:termn){
			total+=x;
		}
		return total/termn.length;
	}
}
