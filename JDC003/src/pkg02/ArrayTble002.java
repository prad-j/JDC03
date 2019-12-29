package pkg02;

public class ArrayTble002 {
	public static void main(String args[]){
		System.out.println("Subject name \t Marks");
		
		String snm[]={"Physics","Chemistry","Mathematics","Electronics","English"};
		int grd[]={100, 100, 100, 200, 96};
		
		for(int c=0;c<snm.length;c++){
			System.out.println(snm[c]+" \t"+grd[c]);
		}
	}
}
