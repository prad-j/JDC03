package pkg02;

public class EnhancedForLoop001 {
	public static void main(String args[]){
		int ar[]={2,5,3,5,4,9};
		int total=0;
		
		for(int x:ar){
			total+=x;
		}
		System.out.println("Total is "+total);
	}

}
