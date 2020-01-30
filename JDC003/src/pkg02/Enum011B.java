package pkg02;

public enum Enum011B {
	Anil("Mulund", 26),
	Raju("Vikhroli", 25),
	Manish("Colaba", 27),
	Ramesh("Dadar", 28);
	
	private final String place;
	private final int age;
	
	Enum011B(String iPlace, int iAge){
		place=iPlace;
		age=iAge;
	}
	public String getPlace(){
		return place;
	}
	public int getAge(){
		return age;
	}
}
