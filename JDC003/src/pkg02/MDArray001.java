package pkg02;

public class MDArray001 {
	public static void main(String args[]){
		int ar[][]={{5,7,5,1,5,4,3},{6,1,4,2}};
		display(ar);
	}
	public static void display(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int c=0;c<x[row].length;c++){
				System.out.print(x[row][c]+" ");
			}
			System.out.println();
		}
		
	}
}
