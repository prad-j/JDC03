package pkg02;

public class EnhanForLoop002 {
	public static void main(String args[]){
		int ar[]={5,6,5,4,2,3};
		int total=0;
		for(int x:ar){
			total+=x;
		}
		System.out.println("Total is "+total);
	}
}
