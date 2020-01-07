package pkg02;

public class ArrayInMethod002 {
	public static void main(String args[]){
		int ar[]={5,6,2,3,4,5,1};
		
		change(ar);
		
		for(int z:ar){
			System.out.println(z);
		}
	}
	public static void change(int x[]){
		for(int c=0;c<x.length;c++){
			x[c]+=2;
		}
	}

}
