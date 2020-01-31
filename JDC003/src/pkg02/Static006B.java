package pkg02;

public class Static006B {
	private String fname;
	private String lname;
	
	private static int rollno=0;
	
	public Static006B(String fn, String ln){
		fname=fn;
		lname=ln;
		rollno++;
		
		System.out.printf("The constructor for %s %s, and roll number is %d\n",fname, lname, rollno);
	} 
	
	public String getFname(){
		return fname;
	}
	public String getLname(){
		return lname;
	}
	public static int getRollno(){
		return rollno;
	}
}
