package pkg02;

public enum Enum006B {
	Anil("Mumbai", 35),
	Sunil("Pune", 28),
	Abhishek("Thane", 32),
	Samir("Navi Mumbai", 38),
	Jagan("Jalgaon", 33),
	Dinesh("Dhule", 34),
	Narendra("Nanded", 31);
	
	private final String town;
	private final int age;
	
	Enum006B(String iTown, int iAge){
		town=iTown;
		age=iAge;
	}
	public String getTown(){
		return town;
	}
	public int getAge(){
		return age;
	}
}
