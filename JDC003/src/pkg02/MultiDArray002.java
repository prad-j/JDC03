package pkg02;

public class MultiDArray002 {
	public static void main(String args[]){
		int ar[][]={{2,5,2,3,4,2},{6,4,1,5,2,3}};
		
		prnt(ar);
	}
	public static void prnt(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int col=0;col<x[row].length;col++){
				System.out.print(x[row][col]+"\t");
			}
			System.out.println();
		}
	}

}
