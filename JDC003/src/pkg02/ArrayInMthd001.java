package pkg02;

public class ArrayInMthd001 {
	public static void main(String args[]){
		int ar[]={3,5,1,6,4,2,3};
		
		change(ar);
		
		prnt(ar);
		
	}
	public static void change(int x[]){
		for(int c=0;c<x.length;c++){
			x[c]+=2;
		}
	}
	public static void prnt(int z[]){
		for(int v=0;v<z.length;v++){
			System.out.println(z[v]);
		}
	}

}
