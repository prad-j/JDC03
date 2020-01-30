package pkg02;

public enum Enum012B {
	Vijay("Vadodara", 46),
	Suresh("Jalgaon", 47),
	Amol("Pune", 44),
	Anil("Delhi", 48);
	
	private final String place;
	private final int age;
	
	Enum012B(String iPlace, int iAge){
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
