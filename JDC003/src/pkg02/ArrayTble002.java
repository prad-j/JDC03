package pkg02;

public class ArrayTble002 {
	public static void main(String args[]){
		double total =0;
		double percent=0;
		
		System.out.println("Subject name\tMarks");
		System.out.println("-----------------------");
		
		String snm[]={"Physics","Chemistry","Mathematics","Electronics","English"};
		int grd[]={100, 100, 100, 200, 96};
		
		for(int c=0;c<snm.length;c++){
			System.out.println(snm[c]+" \t"+grd[c]);
		}
		for (int c=0;c<grd.length;c++){
			total=total+grd[c];
		}
		
		percent=(100*total)/600;
		
		System.out.println();
		System.out.println("Total number of marks obtained are "+total+".");
		System.out.println();
		System.out.println("The percentage obtained is "+percent+".");
	}
}
