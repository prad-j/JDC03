package pkg02;

public class ArrayEleAd001 {
	public static void main(String args[]){
		int ar[]={5,2,3,1,6,4,2};
		
		for(int c=0;c<ar.length;c++){
			ar[c]+=1;
		}
		for(int x:ar){
			System.out.println(x);
		}
	}

}
