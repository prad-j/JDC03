package pkg02;

public enum Enum004B {
	Raju("Pune", 32),
	Mangesh("Dhule", 33),
	Nilesh("Mumbai", 35),
	Rajendra("Bangkok", 40);
	
	private final String place;
	private final int age;
	
	Enum004B(String pName, int pAge){
		place=pName;
		age=pAge;
	} 
	public String getPlace(){
		return place;
	}
	public int getAge(){
		return age;
	}
}
