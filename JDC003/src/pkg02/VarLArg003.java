package pkg02;

public class VarLArg003 {
	public static void main(String args[]){
		System.out.println(avg(112,203,145,150,168,175,225));
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
