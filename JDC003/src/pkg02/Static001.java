package pkg02;

public class Static001 {
	private String firstName;
	private String lastName;
	
	private static int members = 0;
	
	public Static001(String fn, String ln){
		firstName=fn;
		lastName=ln;
		members++;
		
		System.out.printf("The constructor for %s %s, members in the club are: %d\n", firstName, lastName, members);
	}
}
