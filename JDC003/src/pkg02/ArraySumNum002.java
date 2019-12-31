package pkg02;

public class ArraySumNum002 {
	public static void main(String args[]){
		int ar[]=new int[4];
		
		for(int a=0;a<10;a++){
			ar[0]=a;
			for(int b=0;b<10;b++){
				ar[1]=b;
				for(int c=0;c<10;c++){
					ar[2]=c;
					for(int d=0;d<10;d++){
						ar[3]=d;
						System.out.println(ar[0]+" "+ar[1]+" "+ar[2]+" "+ar[3]+" ");
					}
				}
			}
		}
	}
}
