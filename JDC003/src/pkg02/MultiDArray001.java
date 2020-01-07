package pkg02;

public class MultiDArray001 {
	public static void main(String args[]){
		int fay[][]={{5,4,4,2,6,1},{7,2,1,5,2,4}};
	
		display(fay);
	}
	public static void display(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int col=0;col<x[row].length;col++){
				System.out.print(x[row][col]+"\t");
			}
			System.out.println();
		}
	}
}


