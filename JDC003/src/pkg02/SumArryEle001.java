package pkg02;

public class SumArryEle001 {
	public static void main(String args[]){
		int ar[]={11, 36, 25, 41, 23, 37, 27};
		int total=0;
		for(int i=0;i<ar.length;i++){
			total=total+ar[i];
		}
		System.out.println("Total is "+total);
	}
	
}
