package pkg02;

public class LuckyNumFindA {
	public static void main(String args[]){
		int num[]=new int[4];
		int sum=0;
		
		
		for(int a=0;a<10;a++){
			num[0]=a;
			for(int b=0;b<10;b++){
				num[1]=b;
				for(int c=0;c<10;c++){
					num[2]=c;
					for(int d=0;d<10;d++){
						num[3]=d;
						
						int total=0;
						for(int t=0;t<num.length;t++){
							total+=num[t];					
							}
						
						if(total==3){
							System.out.println(num[0]+" "+num[1]+" "+num[2]+" "+num[3]);
							System.out.println(total);
							System.out.println();
						}
						if(total>10){
							int n=total;
							for(sum=0;n!=0;n/=10){
								sum+=n%10;
							}
							if(sum==3){
								System.out.println(num[0]+" "+num[1]+" "+num[2]+" "+num[3]);
								System.out.println(sum);
								System.out.println();
							}
						}
					}
				}
			}
		}
		
		
	}

}
