package pkg02;

public class Static005B {
	private String fname;
	private String lname;
	
	private static int rollNo=0;
	
	public Static005B(String fn, String ln){
		fname=fn;
		lname=ln;
		rollNo++;
		
		System.out.printf("The constructor for %s %s, and roll number is %d\n", fname, lname, rollNo);
	}
}
