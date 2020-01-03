package pkg02;

public class EnhancedFor001 {
	public static void main(String args[]){
		int total=0;
		int ar[]={25,65,44,65,65,65,78,88};
		
		for(int x:ar){
			total+=x;
		}
		System.out.println("Total is "+total);
		
	}

}
