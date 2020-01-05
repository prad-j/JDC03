package pkg02;

public class NumD2n3 {
	public static void main(String args[]){
		int a=25;
		int b=5;
				
		for(int i=1;i<=(a*b);i++){
			if(i%a==0&&i%b==0){
				System.out.println(i);
				break;
			}
			
		}
		
	}
}
