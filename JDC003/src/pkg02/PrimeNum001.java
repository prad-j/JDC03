package pkg02;

public class PrimeNum001 {
	public static void main(String args[]){
		int n=10;
		int m;
		int f =0;
		
		m=n/2;
		
		if(n==0||n==1){
			System.out.println(n+" is a prime number.");
		}else{
			for(int i=2;i<=m;i++){
				if(n%i==0){
					System.out.println(n+" is not a prime number.");
					f=1;
					break;
				}		
				
			}if(f==0){
				System.out.println(n+" is a prime number.");
			}
		}
	}
	
}
