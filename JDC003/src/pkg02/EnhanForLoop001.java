package pkg02;

public class EnhanForLoop001 {
	public static void main(String args[]){
		int ar[]={22,33,12,25,24,12};
		int total=0;
		
		for(int x:ar){
			total+=x;
		}
		System.out.println("Total is "+total);
	}
}
