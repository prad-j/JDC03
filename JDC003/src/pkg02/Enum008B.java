package pkg02;

public enum Enum008B {
	Raju("Pune", 25),
	Girish("Dhule", 35),
	Harish("Jalgaon", 30),
	Mangesh("Nagpur", 36),
	Rajendra("Vashi", 40),
	Prakash("Chennai", 45);
	
	private final String city;
	private final int age;
	
	Enum008B(String iCity, int iAge){
		city=iCity;
		age=iAge;
	}
	public String getCity(){
		return city;
	}
	public int getAge(){
		return age;
	}
}
