package pkg02;

public class CmpdInt001 {
	public static void main(String args[]){
		double p, a, r, n;
		
		p= 100;
		r=0.1;
		n=1;
		
		//a=p(1+r)^n
		
		a=p*Math.pow(1+r, 3);
		
		System.out.println("Amount after 2 years "+a);
	}

}
