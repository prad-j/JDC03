package pkg02;

public class MultiDArray003 {
	public static void main(String args[]){
		int ar[][]={{2,3,54,6,2,7},{2,1,4,8,2}};
		prnt(ar);
		
	}
	public static void prnt(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int col=0;col<x[row].length;col++){
				System.out.print(x[row][col]+" ");
			}
			System.out.println();
		}
	}

}
