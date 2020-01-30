package pkg02;

public class Static003B {
	private String firstName;
	private String lastName;
	
	private static int rollNo=0;
	
	public Static003B(String fn, String ln){
		firstName=fn;
		lastName=ln;
		rollNo++;
		
		System.out.printf("The constructor for %s %s and roll number is: %d\n", firstName, lastName, rollNo);
	}
	
}
