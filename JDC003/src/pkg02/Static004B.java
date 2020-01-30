package pkg02;

public class Static004B {
	public String fname;
	public String lname;
	
	public static int rollNo=0;
	
	public Static004B(String fn, String ln){
		fname=fn;
		lname=ln;
		rollNo++;
		
		System.out.printf("The constructor for %s %s, and roll no is : %d\n",fname, lname, rollNo);
	}
}
