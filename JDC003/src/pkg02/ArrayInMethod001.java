package pkg02;

public class ArrayInMethod001 {
	public static void main(String args[]){
		int ar[]={2,3,1,4,2};
		
		change(ar);
		
		for(int y:ar)
			System.out.println(y);
	}
	
	public static void change(int x[]){
		for (int c=0;c<x.length;c++)
			x[c]+=2;
	}
	

}
