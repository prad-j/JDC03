package pkg02;

public class ArrayInMethod003 {
	public static void main(String args[]){
		int ar[]={5,4,6,7,9,2,9};
		int ar1[]={4,2,1,3};
		
		adr(ar);
		prnt(ar);
		System.out.println();
		dedt(ar1);
		prnt(ar1);
		
	}
	public static void adr(int x[]){
		for(int c=0;c<x.length;c++){
			x[c]+=2;
		}
		
	}
	public static void dedt(int w[]){
		for(int t=0;t<w.length;t++){
			w[t]-=4;
		}
	}
	
	public static void prnt(int z[]){
		for(int s:z){
			System.out.println(s);
		}
	}
}
