package pkg02;

public class Static007B {
	private String fName;
	private String lName;
	private static int members=0;
	
	public Static007B(String fn, String ln){
		fName=fn;
		lName=ln;
		members++;
		
		System.out.printf("This is constructor for %s %s, and total members now %d\n", fName, lName, members);
	}
	public String getFName(){
		return fName;
	}
	public String getLName(){
		return lName;
	}
	public int getMembers(){
		return members;
	}
	
}
