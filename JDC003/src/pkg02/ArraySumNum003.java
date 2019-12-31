package pkg02;

public class ArraySumNum003 {
	public static void main(String args[]){
		int ar[]=new int[2];
		int total=0;
		
		for(int a=0;a<10;a++){
			ar[0]=a;
			for(int b=0;b<10;b++){
				ar[1]=b;
				
				total=ar[0]+ar[1];
				if(total==9){
					System.out.println(ar[0]+"  "+ar[1]);
					System.out.println(total);
					System.out.println();
				}
			
			}
		}
	}
}
