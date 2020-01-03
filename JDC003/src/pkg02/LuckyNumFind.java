package pkg02;

public class LuckyNumFind {
	public static void main(String args[]){
		int num[]=new int[4];
		int total=0;
		
		
		for(int a=0;a<10;a++){
			num[0]=a;
			for(int b=0;b<10;b++){
				num[1]=b;
				for(int c=0;c<10;c++){
					num[2]=c;
					for(int d=0;d<10;d++){
						num[3]=d;
						
						total=num[0]+num[1]+num[2]+num[3];
						
						if(total==3){
							System.out.println(num[0]+" "+num[1]+" "+num[2]+" "+num[3]);
							System.out.println(total);
							System.out.println();
						}
					}
				}
			}
		}
		
		
	}

}
