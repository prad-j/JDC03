package pkg02;

public class VarLArg005 {
	public static void main(String args[]){
		System.out.println(avgw(8,9,7,10,8,7,9,8,10,9));
	}
	public static int avgw(int...wkts){
		int total=0;
		int avg=0;
		for(int x:wkts){
			total+=x;
			avg=total/wkts.length;
		}
		return avg;
	}
}
