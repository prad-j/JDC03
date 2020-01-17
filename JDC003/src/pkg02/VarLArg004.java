package pkg02;

public class VarLArg004 {
	public static void main(String args[]){
		System.out.println(avg(203,208,259,269,301,265,289,356));
	}
	public static int avg(int...runs){
		int total=0;
		int avg=0;
		for(int x:runs){
			total+=x;
			avg=total/runs.length;
		}
		return avg;
	}
}
